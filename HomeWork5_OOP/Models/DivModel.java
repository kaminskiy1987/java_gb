package HomeWork5_OOP.Models;

import HomeWork5_OOP.Base.CalcModel;

public class DivModel extends CalcModel {

    /**
     * Методы result, setX, setY отвечают за деление двух комплексных чисел
     */
    @Override
    public double result() {
        return x / y;
    }

    @Override
    public void setX (double value) {
        super.x = value;    
    }

    @Override
    public void setY(double value) {
        super.y = value;   
    }

    
}