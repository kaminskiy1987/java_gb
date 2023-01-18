package HomeWork5_OOP.Interfaces;

import HomeWork5_OOP.Complex.Complex;

public interface IModelComplex {
    /**
     * интерфейс с методами для вычисления в комплексном калькуляторе
     */
    Complex result();
    void setA(Complex value);
    void setB(Complex value);
}