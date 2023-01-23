package HomeWork6_OOP.Core.MVP;

import java.util.Scanner;

/**
 * Класс ViewConsole имплементирует методы View для работы в консоле
 */
public class ViewConsole implements View {
    Scanner in;

    private String menu = "1: Добавить сотрудника\n2: Список сотрудников\n0: Выход\n";

    private final String successAdded = "\nСотрудник успешно занесен в базу\n";

    public String getSuccessAdded() {
        return successAdded;
    }

    public ViewConsole() {
        in = new Scanner(System.in);
    }

    @Override
    public String inputFullName() {
        System.out.println("Введите ФИО: ");
        return in.nextLine();
    }

    @Override
    public String inputDateOfBirth() {
        System.out.println("Введите дату рождения: ");
        return in.nextLine();
    }

    @Override
    public String inputDivision() {
        System.out.println("Введите Подразделение Организации: ");
        return in.nextLine();
    }

    @Override
    public String inputPosition() {
        System.out.println("Введите должность: ");
        return in.nextLine();
    }

    @Override
    public Integer inputSalary() {
        System.out.println("Введите оклад: ");
        Integer salary = Integer.valueOf(in.nextLine());
        System.out.println(getSuccessAdded());
        return salary;
    }

    @Override
    public void print(String value) {
        System.out.println(value);
    }

    @Override
    public void showMenu() {
        System.out.println(menu);
    }

    @Override
    public String inputMenu() {
        System.out.println("Введите пункт меню: ");
        return in.nextLine();
    }

    @Override
    public void exitMessage() {
        System.out.println("\nВсего хорошего!\n");
    }

    @Override
    public void errorMessage() {
        System.out.println("\nВыбирайте нужный пункт меню!\n");
    }
}