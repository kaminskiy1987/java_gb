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
        String pathJson = "W1.json";
        String pathMd = "W2.md";
        String pathXml = "W3.xml";
        /**
         * Запись данных в различные форматы
         */
        Worker worker = new Worker(32, 35000, "Ivan", "Ivanov" );
        Document doc = new Document<Worker>(worker);

        doc.setFormat(new JsonFormat());
        doc.setPath(pathJson);
        doc.saveInFormat();

        doc.setFormat(new MdFormat());
        doc.setPath(pathMd);
        doc.saveInFormat();

        doc.setFormat(new XmlFormat());
        doc.setPath(pathXml);
        doc.saveInFormat();
    }
}
