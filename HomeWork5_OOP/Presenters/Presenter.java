package HomeWork5_OOP.Presenters;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import HomeWork5_OOP.Interfaces.IChoosingAction;
import HomeWork5_OOP.Interfaces.ILogger;
import HomeWork5_OOP.Interfaces.IView;

public class Presenter {
    private final IView myView;
    private final IChoosingAction myModel;
    private final ILogger mylogger;
    

    public Presenter(IView myView, IChoosingAction myModel, ILogger mylogger) {
        this.myView = myView;
        this.myModel = myModel;
        this.mylogger = mylogger;
    }

    /**
     * Метод buttonClick связывает работу View и Model для классического калькулятора
     */
    public void buttonClick() {
        double a = myView.getValue("Первое число");
        String sign = myView.getSign("Математическая операция");
        double b = myView.getValue("Второе число");
        List<Double> operandsList = new ArrayList<>();
        operandsList.add(a);
        operandsList.add(b);
        double result = myModel.chooseModel(sign, operandsList).result();
        String resString = String.format("%f %s %f = %f", a, sign, b, result);
        myView.showResult(resString);
        mylogger.log(Presenter.class.getSimpleName(), "buttonClick", resString);
    }
}