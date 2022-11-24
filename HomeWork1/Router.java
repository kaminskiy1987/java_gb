import java.util.Scanner;

public class Router {
    public static int getNaturalNumber(String string, Scanner input) {
            int number = 0;
            boolean isCheck = false;

            while (!isCheck) {
                System.out.printf("Введите натуральное число %s: ", string);

                while (!input.hasNextInt()) {
                    System.out.println("Вы ввели не число, повторите ввод!");
                    input.next();
                }

                number = input.nextInt();

                if (number <= 0)
                    System.out.println("Вы ввели не натуральное число, повторите ввод!");
                else
                    isCheck = true;
            }

            return number;
    }

    public static long[] getArrayRoute(int a, int b, int c, int d) {
        long[] array = new long[b + 1];
        array[a] = 1;

        for (int index = a + 1; index <= b; index++) {
            if ((index % c == 0) && (index - d >= 0)) { // Добавлена доп. проверка к решению с семинара
                array[index] = array[index - d] + array[index / c];
            } else if (index - d >= 0) { // для исключения выхода за диапазон массива.
                array[index] = array[index - d];
            } else if (index % c == 0)
                array[index] = array[index / c];
            }

        return array;
    }

    public static String getRoute(int a, int b, int c, int d, long[] arr) {
        StringBuilder stringBuilder = new StringBuilder();
        if (arr[b] == 0)
            return stringBuilder.toString();
        else {
            while (b > a) {
                if ((b % c == 0) && (arr[b / c] != 0)) {
                    b = b / c;
                    stringBuilder.insert(0, "k1 ");
                } else if (b - d >= a) {
                    b = b - d;
                    stringBuilder.insert(0, "k2 ");
                }
            }
        }

        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = getNaturalNumber("a", input);
        int b = getNaturalNumber("b", input);
        int c = getNaturalNumber("c", input);
        int d = getNaturalNumber("d", input);
        input.close();

        if (b < a)
            System.out.println(" Решения нет!");
        else {
            int[] arraySize = new int[b + 1];
            System.out.println("\nКарта маршрутов :\n");
            long[] routes = getArrayRoute(a, b, c, d);

            int index;
            for ( index = 0; index < arraySize.length - 1; index++) {
                routes[index] = index;
            }

            System.out.printf("В число %d -> %d маршрутов\n", index, routes[index]);

            String routeString = getRoute(a, b, c, d, routes);

            System.out.printf("\nОдин из возможных маршрутов: \n%s", routeString);
        }
    }
}
