package HomeWork6_OOP.Core.MVP;

import HomeWork6_OOP.Core.Models.Worker;

import java.io.FileNotFoundException;

public class Presenter {
    Model model;
    View view;
    /**
     * Класс Presenter связывает работу View и Model для отображения актуальной информации и обработки данных от пользователя
     */
    public Presenter(View view, String path) {
        this.view = view;
        model = new Model(path);
    }

    /**
     * Сборка Worker
     */
    public void addWorker() {
        Worker worker = new Worker.WorkerBuilder(view.inputFullName())
                .setDateOfBirth(view.inputDateOfBirth())
                .setDivision(view.inputDivision())
                .setPosition(view.inputPosition())
                .setSalary(view.inputSalary())
                .build();
        model.saveWorker(worker);
    }

    public void showWorkers() throws FileNotFoundException {
        view.print(model.loadWorkers());
    }

    public void showMenu() {
        view.showMenu();
    }

    public String inputMenu() {
        return view.inputMenu();
    }

    public void exit() {
        view.exitMessage();
    }

    public void error() {
        view.errorMessage();
    }
}