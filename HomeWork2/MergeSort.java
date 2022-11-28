package HomeWork2;

import java.util.Scanner;

public class MergeSort {
    public static int getNaturalNumber(Scanner input) {
        int number = 0;
        boolean isCheck = false;

        while (!isCheck) {
            System.out.print("Введите размер массива : ");

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

    public static int[] getInputArray(int size, Scanner input) {
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.printf("Введите элемент массива %d: ", i + 1);

            while (!input.hasNextInt()) {
                System.out.println("Вы ввели не число, повторите ввод!");
                input.next();
            }

            array[i] = input.nextInt();
        }

        return array;
    }

    public static void printArray(int[] arr) {
        StringBuilder stringBuilder = new StringBuilder();
        System.out.print("[ ");

        for (int i : arr) {
            stringBuilder.append(i).append(", ");
        }

        int indexDelete = stringBuilder.lastIndexOf(",");

        if (indexDelete > 0){
            stringBuilder.deleteCharAt(indexDelete);
        }

        String string = stringBuilder.toString();
        System.out.print(string + "]\n");
    }

    private static void mergeArrays(int[] arr, int[] left, int[] right) {
        int leftLength = left.length;
        int rightLength = right.length;
        int i = 0;
        int j = 0;
        int index = 0;

        while (i < leftLength && j < rightLength){
            if (left[i] < right[j]){
                arr[index] = left[i];
                i++;
            }else{
                arr[index] = right[j];
                j++;
            }
            index++;
        }

        for (int leftIndex = i; leftIndex < leftLength; leftIndex++) {
            arr[index++] = left[leftIndex];
        }

        for (int rightIndex = j; rightIndex < rightLength; rightIndex++) {
            arr[index++] = right[rightIndex];
        }
    }

    private static void sortArray(int[] arr) {
        int size = arr.length;
        if (size == 1) return;

        int middle = size / 2;
        int[] leftArray = new int[middle];
        int[] rightArray = new int[size - middle];

        System.arraycopy(arr, 0, leftArray, 0, middle);
        if (size - middle >= 0) System.arraycopy(arr, middle, rightArray, 0, size - middle);

        sortArray(leftArray);
        sortArray(rightArray);
        mergeArrays(arr, leftArray, rightArray);
    }

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = getNaturalNumber(scanner);
        int[] array = getInputArray(size, scanner);
        scanner.close();

        System.out.println("Массив до сортировки слиянием:");
        printArray(array);

        sortArray(array);
        System.out.println("Массив после сортировки слиянием:");
        printArray(array);
    }
}