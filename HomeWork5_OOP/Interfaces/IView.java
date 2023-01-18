package HomeWork5_OOP.Interfaces;

public interface IView {
    /**
     * интерфейс с методами для вывода информации в классическом калькуляторе
     */
    double getValue (String stringName);

    String getSign (String stringName);

    void showResult(String stringName);
}