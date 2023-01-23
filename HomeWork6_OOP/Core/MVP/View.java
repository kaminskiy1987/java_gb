package HomeWork6_OOP.Core.MVP;

public interface View {
    /**
     * интерфейс с методами для ввода и вывода информации
     */
    String inputFullName();

    String inputDateOfBirth();

    String inputDivision();

    String inputPosition();

    Integer inputSalary();

    void print(String value);

    void showMenu();

    String inputMenu();

    void exitMessage();

    void errorMessage();
}