package HomeWork5_OOP.Interfaces;

public interface IViewComplex {
    /**
     * интерфейс с методами для вывода информации в комплексном калькуляторе
     */
    String getValue (String stringName);

    String getSign (String stringName);

    String showResult(String stringName);
}