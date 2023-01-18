package HomeWork5_OOP.ModelsComplex;

import HomeWork5_OOP.BaseComplex.CalcModelComplex;
import HomeWork5_OOP.Complex.Complex;

public class SumModelComplex extends CalcModelComplex {
    protected Complex a;

    /**
     * Методы result, setA, setB отвечают за суммирование двух чисел
     */
    @Override
    public Complex result() {
        return new Complex((super.a.getX() + super.b.getX()), (super.a.getY() + super.b.getY()));
    }

    @Override
    public void setA(Complex a) {
        super.a = a;
    }

    @Override
    public void setB(Complex b) {
        super.b = b;
    }
}