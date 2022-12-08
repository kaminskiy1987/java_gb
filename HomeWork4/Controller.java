package HomeWork4;

import java.util.Scanner;

public class Controller {
    public static void runAlgorithm() {
        Scanner input = new Scanner(System.in);
        int startX = Input.getInputData("(координата входа X)", input);
        int startY = Input.getInputData("(координата входа Y)", input);
        int finalX = Input.getInputData("(координата выхода X)", input);
        int finalY = Input.getInputData("(координата выхода Y)", input);
        input.close();

        Maze maze = new Maze();
        DiscreteWorkField start = new DiscreteWorkField(startX, startY);
        DiscreteWorkField exit = new DiscreteWorkField(finalX, finalY);
        maze.setExit(exit);

        Model wave = new Model(maze.getTable());
        wave.getNumberedMaze(start);

        System.out.print("\nКарта с обходом волновым алгоритмом:\n");
        System.out.println(
                new View().getRawData(
                        maze.getTable()));

        wave.showRoad(wave.getRoad(exit));
        System.out.print("\nКарта с визуализацией пути от старта до финиша:\n");
        System.out.println(
                new View().getVisualData(
                        maze.getTable()));
    }
}