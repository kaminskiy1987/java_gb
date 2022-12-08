package HomeWork4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Model {
    int[][] table;

    public Model(int[][]  table) {
        this. table =  table;
    }

    public void getNumberedMaze(DiscreteWorkField startPoint) {
        Queue<DiscreteWorkField> queue = new LinkedList<>();
        queue.add(startPoint);
        table[startPoint.x][startPoint.y] = 1;

        while (queue.size() != 0) {
            DiscreteWorkField cell = queue.remove();

            if ( table[cell.x - 1][cell.y] == 0) {
                queue.add(new DiscreteWorkField(cell.x - 1, cell.y));
                table[cell.x - 1][cell.y] =  table[cell.x][cell.y] + 1;
            }

            if ( table[cell.x][cell.y - 1] == 0) {
                queue.add(new DiscreteWorkField(cell.x, cell.y - 1));
                table[cell.x][cell.y - 1] =  table[cell.x][cell.y] + 1;
            }

            if ( table[cell.x + 1][cell.y] == 0) {
                queue.add(new DiscreteWorkField(cell.x + 1, cell.y));
                table[cell.x + 1][cell.y] =  table[cell.x][cell.y] + 1;
            }

            if ( table[cell.x][cell.y + 1] == 0) {
                queue.add(new DiscreteWorkField(cell.x, cell.y + 1));
                table[cell.x][cell.y + 1] =  table[cell.x][cell.y] + 1;
            }
        }
    }

    public ArrayList<DiscreteWorkField> getRoad(DiscreteWorkField exit) {
        ArrayList<DiscreteWorkField> road = new ArrayList<>();

        int count = 99;
        int min = 99;

        if ( table[exit.x - 1][exit.y] < min &&  table[exit.x - 1][exit.y] != -1) {
           min =  table[exit.x - 1][exit.y];
            count = 0;

        } if ( table[exit.x][exit.y - 1] < min &&  table[exit.x][exit.y - 1] != -1) {
            min =  table[exit.x][exit.y - 1];
            count = 1;

        } if ( table[exit.x + 1][exit.y] < min &&  table[exit.x + 1][exit.y] != -1) {
            min =  table[exit.x + 1][exit.y];
            count = 2;

        } if ( table[exit.x][exit.y + 1] < min &&  table[exit.x][exit.y + 1] != -1) {
            min =  table[exit.x][exit.y + 1];
            count = 3;
        }

        switch (count) {
            case 0:
                road.add(new DiscreteWorkField(exit.x - 1, exit.y));
                exit.x = exit.x - 1;
                break;
            case 1:
                road.add(new DiscreteWorkField(exit.x, exit.y - 1));
                exit.y = exit.y - 1;
                break;
            case 2:
                road.add(new DiscreteWorkField(exit.x + 1, exit.y));
                exit.x = exit.x + 1;
                break;
            case 3:
                road.add(new DiscreteWorkField(exit.x, exit.y + 1));
                exit.y = exit.y + 1;
                break;

        }

        while ( table[exit.x][exit.y] != 2) {

            if ( table[exit.x - 1][exit.y] ==  table[exit.x][exit.y] - 1) {
                road.add(new DiscreteWorkField(exit.x - 1, exit.y));
                exit.x = exit.x - 1;
            }else if ( table[exit.x][exit.y - 1] ==  table[exit.x][exit.y] - 1) {
                road.add(new DiscreteWorkField(exit.x, exit.y - 1));
                exit.y = exit.y - 1;
            }else if ( table[exit.x + 1][exit.y] ==  table[exit.x][exit.y] - 1) {
                road.add(new DiscreteWorkField(exit.x + 1, exit.y));
                exit.x = exit.x + 1;
            }else if ( table[exit.x][exit.y + 1] ==  table[exit.x][exit.y] - 1) {
                road.add(new DiscreteWorkField(exit.x, exit.y + 1));
                exit.y = exit.y + 1;
            }
        }

        return road;
    }

    public void showRoad(ArrayList<DiscreteWorkField> road) {
        for (DiscreteWorkField cells: road) {
            table[cells.getX()][cells.getY()] = 88;
        }
    }
}
