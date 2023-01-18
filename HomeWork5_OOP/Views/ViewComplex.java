package HomeWork5_OOP.Views;

import java.util.Scanner;

import HomeWork5_OOP.Interfaces.IViewComplex;

public class ViewComplex implements IViewComplex{
    Scanner sc = new Scanner(System.in);
    /**
     * Метод getValue, метод getSign, метод showResult для получения значений, знака операции, вывод данных на экран для комплексного калькулятора
     */
    public String getValue (String stringName) {
        System.out.printf("%s: ", stringName);
        return sc.next();
    }

    public String getSign (String stringName) {
        System.out.printf("%s: ", stringName);
        return sc.next();
    }

    public String showResult(String stringName ) {
        if (stringName.contains("+ -")) {
            stringName = stringName.replace("+ -", "+ (-");
            stringName = stringName.replace(" =", ") =");
        } else if (stringName.contains("- -")) {
            stringName = stringName.replace("- -", "- (-");
            stringName = stringName.replace(" =", ") =");
        } else if (stringName.contains("* -")) {
            stringName = stringName.replace("* -", "* (-");
            stringName = stringName.replace(" =", ") =");
        } else if (stringName.contains("/ -")) {
            stringName = stringName.replace("/ -", "/ (-");
            stringName = stringName.replace(" =", ") =");
        }

        System.out.printf("%s\n", stringName);
        return stringName;
    }
}