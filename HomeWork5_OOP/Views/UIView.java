package HomeWork5_OOP.Views;

import java.io.IOException;
import java.util.Scanner;

import HomeWork5_OOP.Base.ChoseModelFactory;
import HomeWork5_OOP.BaseComplex.ChoseModelComplexFactory;
import HomeWork5_OOP.Interfaces.ILogger;
import HomeWork5_OOP.Logging.SimpleLogger;
import HomeWork5_OOP.Presenters.Presenter;
import HomeWork5_OOP.Presenters.PresenterComplex;

public class UIView {
    public Scanner sc = new Scanner(System.in);
    /**
     * Метод consoleUICalc для работы пользователя в консоле и отправки данных в лог
     */
    public void consoleUICalc() throws IOException {
        ILogger logger = new SimpleLogger();
        logger.getLog();
        logger.log(UIView.class.getSimpleName(), "consoleUICalc", "the calculator starts");
        Presenter pres = new Presenter(new View(), new ChoseModelFactory(), logger);
        PresenterComplex presComplex = new PresenterComplex(new ViewComplex(), new ChoseModelComplexFactory(), logger);
        System.out.println("Меню:\n1 - Классический калькулятор;\n2 - Комплексный калькулятор;\n0 - Выход.");
        boolean loop = true;
        while (loop) {
            System.out.println("Выведите команду из меню или вводите 0, чтобы выйти: ");
            int myChoice = sc.nextInt();
            switch (myChoice) {
                case 1 :
                    logger.log(UIView.class.getSimpleName(), "consoleUICalc", "a common regime is initialised");
                    pres.buttonClick();
                    break;

                case 2 :
                    logger.log(UIView.class.getSimpleName(), "consoleUICalc", "a complex regime is initialised");
                    presComplex.buttonClickComplex();
                    break;

                case 0 :
                    sc.close();
                    loop = false;
                    break;
            }
        }

        logger.log(UIView.class.getSimpleName(), "consoleUICalc", "the calculator finishes");
    }
}