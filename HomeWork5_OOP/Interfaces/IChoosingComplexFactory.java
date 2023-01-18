package HomeWork5_OOP.Interfaces;

import java.util.List;

import HomeWork5_OOP.Complex.Complex;

public interface IChoosingComplexFactory {
    /**
     * интерфейс с методом chooseModelComplex для выбора модели вычисления
     */
    IModelComplex chooseModelComplex(String sign, List<Complex> operandList);
}