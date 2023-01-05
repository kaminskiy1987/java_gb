package HomeWork3_OOP;

import HomeWork3_OOP.Classes.Worker;
import HomeWork3_OOP.Model.Document;
import HomeWork3_OOP.Model.JsonFormat;
import HomeWork3_OOP.Model.MdFormat;
import HomeWork3_OOP.Model.XmlFormat;

public class Controller {
    public static void runAlgorithm(){
        /**
         * Различные форматы
         */
        String pathJson = "WorkerJson.json";
        String pathMd = "WorkerMd.md";
        String pathXml = "WorkerXml.xml";
        /**
         * Запись данных в различные форматы
         */
        Worker worker = new Worker(32, 35000, "Ivan", "Ivanov" );
        Document document = new Document<Worker>(worker);

        document.setFormat(new JsonFormat());
        document.setPath(pathJson);
        document.saveInFormat();

        document.setFormat(new MdFormat());
        document.setPath(pathMd);
        document.saveInFormat();

        document.setFormat(new XmlFormat());
        document.setPath(pathXml);
        document.saveInFormat();
    }
}
