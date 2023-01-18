package HomeWork5_OOP.Interfaces;

import java.util.List;

public interface IChoosingAction {
    /**
     * интерфейс с методом chooseModel для выбора модели вычисления
     */
    IModel chooseModel(String sign, List<Double> operandList);
}