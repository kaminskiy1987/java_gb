package HomeWork5_OOP.Presenters;

import java.util.ArrayList;
import java.util.List;

import HomeWork5_OOP.Complex.Complex;
import HomeWork5_OOP.Complex.ComplexCreater;
import HomeWork5_OOP.Interfaces.IChoosingComplexFactory;
import HomeWork5_OOP.Interfaces.ILogger;
import HomeWork5_OOP.Interfaces.IViewComplex;

public class PresenterComplex {
    private final IViewComplex viewComplex;
    private final IChoosingComplexFactory modelComplex;
    private final ILogger loggerComplex;

    public PresenterComplex(IViewComplex viewComplex, IChoosingComplexFactory modelComplex, ILogger loggerComplex) {
        this.viewComplex = viewComplex;
        this.modelComplex = modelComplex;
        this.loggerComplex = loggerComplex;
    }

    /**
     * Метод buttonClick связывает работу View и Model для комплексного калькулятора
     */
    public void buttonClickComplex() {
        ComplexCreater myComplex = new ComplexCreater();
        Complex a = myComplex.createComplex(viewComplex.getValue("Первый операнд в формате '0.0+0.0i'"));
        String sign = viewComplex.getSign("Введите знак : '*, /, +, - '");
        Complex b = myComplex.createComplex(viewComplex.getValue("Второй операнд в формате '0.0+0.0i'"));
        List<Complex> operandList = new ArrayList<>();
        operandList.add(a);
        operandList.add(b);
        Complex result = modelComplex.chooseModelComplex(sign, operandList).result();
        String resString = String.format("%s %s %s = %s", a.toString(), sign, b.toString(), result.toString());
        resString = viewComplex.showResult(resString);
        loggerComplex.log(PresenterComplex.class.getSimpleName(), "buttonClickComplex", resString);
    }
}