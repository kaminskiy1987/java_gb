package HomeWork6_OOP.Core.MVP;

import HomeWork6_OOP.Config;
import java.io.IOException;

public class App {
    public static void clickButton() throws IOException {
        /**
         * Метод clickButton() служит для работы в меню пользователя
         */
        Presenter presenter = new Presenter(new ViewConsole(), new Config().getPath());

        while (true) {
            presenter.showMenu();
            String choose = presenter.inputMenu();

            if (choose.equals("1")) {
                presenter.addWorker();
            } else if (choose.equals("2")) {
                presenter.showWorkers();
            } else if (choose.equals("0")) {
                break;
            } else {
                presenter.error();
            }
        }

        presenter.exit();
    }
}