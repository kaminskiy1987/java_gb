package HomeWork2_OOP;

import HomeWork2_OOP.Human;
import HomeWork2_OOP.Relatives;
import HomeWork2_OOP.Controller;
import HomeWork2_OOP.Loader;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Human> humans = new ArrayList<>();
        List<Relatives> bloodLine = new ArrayList<>();
        Loader loader = new Loader();
        Controller controller = new Controller(loader, humans, bloodLine);
        Controller.runAlgorithm(controller, scanner);
    }
}