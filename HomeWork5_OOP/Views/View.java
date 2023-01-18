package HomeWork5_OOP.Views;

import java.util.Scanner;

import HomeWork5_OOP.Interfaces.IView;

public class View implements IView{
    Scanner sc = new Scanner(System.in);
    /**
     * Метод getValue и метод getSign для получения значений и знака операции
     */
    public double getValue (String stringName) {
        System.out.printf("%s: ", stringName);
        return sc.nextDouble();
    }

    public String getSign (String stringName) {
        System.out.printf("%s: ", stringName);
        return sc.next();
    }

    public void showResult(String stringName ) {
        System.out.printf("%s\n", stringName);
    }
}