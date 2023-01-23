package HomeWork6_OOP.Core.MVP;

import HomeWork6_OOP.Core.Models.Worker;

import java.io.*;
import java.util.Scanner;


public class Model {
    private final String path;

    /**
     * Методы saveWorker(), loadWorkers(), для записи и отображения базы данных сотрудников
     */
    public Model(String path) {
        this.path = path;
    }

    public void saveWorker(Worker worker) {
        try {
            File file = new File(path + "/" + worker.getFullName() + ".txt");
            FileWriter writer = new FileWriter(file);
            String text = worker.info();
            writer.write(text);
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String loadWorkers() throws FileNotFoundException {
        File folder = new File(path);
        File[] folderEntries = folder.listFiles();

        StringBuilder workers = new StringBuilder("\n");

        for (File entry : folderEntries) {
            workers.append("\n");
            FileReader file = new FileReader(entry);
            Scanner scan = new Scanner(file);

            while (scan.hasNextLine()) {
                workers.append(scan.nextLine()).append("\n");
            }

        }

        return workers.toString();
    }
}