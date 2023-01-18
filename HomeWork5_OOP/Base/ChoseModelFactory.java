package HomeWork5_OOP.Base;

import java.util.List;

import HomeWork5_OOP.Models.SumModel;
import HomeWork5_OOP.Interfaces.IChoosingAction;
import HomeWork5_OOP.Interfaces.IModel;
import HomeWork5_OOP.Models.DifModel;
import HomeWork5_OOP.Models.DivModel;
import HomeWork5_OOP.Models.ProdModel;

public class ChoseModelFactory implements IChoosingAction {
    /**
     * Переопределенный метод chooseModel имплеметирующий методы интерфейса IChoosingAction для выбора знака математической операции
     */
    @Override
    public IModel chooseModel(String sign, List<Double> operandList) {
        IModel myAction = null;
        switch (sign) {
            case "*" :
                myAction = new ProdModel();
                break;
            case "/" :
                myAction = new DivModel();
                break;
            case "+" :
                myAction = new SumModel();
                break;
            case "-" :
                myAction = new DifModel();
                break;
        }

        myAction.setX(operandList.get(0));
        myAction.setY(operandList.get(1));
        return myAction;
    }

}