package HomeWork5_OOP.BaseComplex;

import java.util.List;

import HomeWork5_OOP.Complex.Complex;
import HomeWork5_OOP.Interfaces.IChoosingComplexFactory;
import HomeWork5_OOP.Interfaces.IModelComplex;
import HomeWork5_OOP.ModelsComplex.DifModelComplex;
import HomeWork5_OOP.ModelsComplex.DivModelComplex;
import HomeWork5_OOP.ModelsComplex.ProdModelComplex;
import HomeWork5_OOP.ModelsComplex.SumModelComplex;

public class ChoseModelComplexFactory implements IChoosingComplexFactory {
    /**
     * Переопределенный метод chooseModelComplex имплеметирующий методы интерфейса IChoosingComplexFactory для выбора знака математической операции
     */
    @Override
    public IModelComplex chooseModelComplex(String sign, List<Complex> operandList) {
        IModelComplex myAction = null;
        switch(sign) {
            case "*" :
                myAction = new ProdModelComplex();
                break;
            case "/" :
                myAction = new DivModelComplex();
                break;
            case "+" :
                myAction = new SumModelComplex();
                break;
            case "-" :
                myAction = new DifModelComplex();
                break;
        }
        
        myAction.setA(operandList.get(0));
        myAction.setB(operandList.get(1));
        return myAction;
    }
    
}