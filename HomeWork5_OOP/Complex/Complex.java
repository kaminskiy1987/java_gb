package HomeWork5_OOP.Complex;

public class Complex {
    protected double x; // целая часть
    protected double y; // мнимая часть

    /**
     * Конструктор класса Complex
     */
    public Complex(double x) {
        this.x = x;
        this.y = 0;
    }

    public Complex(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Геттеры и Сеттеры класса Complex
     */
    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        if (y >= 0) {
            return x + "+" + y + "i";
        } else {
            return x + "" + y + "i";
        }
    }
}