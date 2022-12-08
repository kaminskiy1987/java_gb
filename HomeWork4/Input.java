package HomeWork4;

import java.util.Scanner;

public class Input {
    public static int getInputData(String string, Scanner input) {
        int number = 0;
        boolean check = false;

        while (!check) {
            System.out.printf("Введите натуральное число, в диапазоне от 0 до 13 %s: ", string);

            while (!input.hasNextInt()) {
                System.out.println("Вы ввели не число, повторите ввод!");
                input.next();
            }

            number = input.nextInt();

            if (number <= 0 || number >= 14)
                System.out.println("Вы ввели не натуральное число или число вне диапазона, повторите ввод!");
            else
                check = true;
        }

        return number;
    }
}