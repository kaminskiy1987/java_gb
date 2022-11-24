import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CalcPow {
    public static double calcPow(int number, int level) {
        int result = number;
        for (int i = 1; i < level; i++)
            result *= number;
        return result;
    }

    public static double getPow(int number, int level) {
        if (level > 0) return calcPow(number, level);
        else if (level < 0) return 1 / calcPow(number, -level);
        else return 1;
    }

    public static void main(String[] args) throws FileNotFoundException {
        int a = 0, b = 0;
        try (Scanner scanner = new Scanner(new FileInputStream("input.txt"));
             PrintWriter writer = new PrintWriter("output.txt")) {
            while (scanner.hasNextLine()) {
                String string = scanner.nextLine();
                String[] stringsArray = string.split(" ");
                if (stringsArray[0].equals("a")) {
                    a = Integer.parseInt(stringsArray[1]);
                } else if (stringsArray[0].equals("b")) {
                    b = Integer.parseInt(stringsArray[1]);
                }
            }

            if (a == 0) {
                System.out.println("Не определено");
                writer.println("Не определено");
            } else{
                System.out.println("Число " + a + " в степени " + b + " равно " + getPow(a, b));
                writer.println(getPow(a, b));
            }
        }
    }
}
