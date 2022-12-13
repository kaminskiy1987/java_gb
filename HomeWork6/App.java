package HomeWork6;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Infrastructure infrastructure = new Infrastructure();

        System.out.println(infrastructure.getAllInfo(1));
        System.out.println(infrastructure.getAllInfo(2));
        System.out.println(infrastructure.getAllInfo(3));
        System.out.println(infrastructure.getAllInfo(4));

        Scanner input = new Scanner(System.in, "Cp866");
        String string = infrastructure.getInputData(input);
        input.close();

        infrastructure.findFilm(string);
    }
}

class Infrastructure {
    public Infrastructure() {
        init();
    }

    Db db;

    public Db getDb() {
        return db;
    }

    public String getAllInfo(int idCinema) {
        Cinema c = db.films.get(idCinema - 1);

        return String.format("%d %s %s %s",
                c.id,
                c.name,
                db.genres.get(c.genre - 1).name,
                db.prod.get(c.filmProd - 1).titleName);
    }

    public String getInputData(Scanner in){
        while (true) {
            System.out.printf("Bведите название фильма или его часть, для завершения поиска введите -1: ");
           
            try{
                String result = in.next();
                return result;
            }catch (Exception ex){
                System.out.println(ex.getMessage());
            }
        }
    }

    Db init() {
        db = new Db();
        Cinema c1 = new Cinema(1, "Тьма", 1, 1);
        Cinema c2 = new Cinema(2, "Свет", 1, 2);
        Cinema c3 = new Cinema(3, "Особенности национальной ...", 3, 4);
        Cinema c4 = new Cinema(4, "Человек паук", 3, 3);

        db.films.add(c1);
        db.films.add(c2);
        db.films.add(c3);
        db.films.add(c4);

        db.genres.add(new Genre(1, "Ужасы"));
        db.genres.add(new Genre(2, "Драма"));
        db.genres.add(new Genre(3, "Комедия"));
        FilmProducerFactory pf = new FilmProducerFactory();
        db.addFilmProducer(pf.getFilmProducer("Ленфильм"));
        db.addFilmProducer(pf.getFilmProducer("Марвел"));
        db.addFilmProducer(pf.getFilmProducer("Мосфильм"));
        db.addFilmProducer(pf.getFilmProducer("DC"));

        return db;
    }

    public void findFilm(String string){
        boolean isCheck = true;
       
        while(isCheck){
            if(string.equals("-1")){
                isCheck = false;
            }else{
                ArrayList<Cinema> filmName = new ArrayList<>();

                for (Cinema c : db.films) {
                    if (c.name.toLowerCase().contains(string.toLowerCase())){
                        filmName.add(c);
                    }
                }

                if (filmName.size() == 0){
                    System.out.println("Не найдено не одного совпадения");
                    break;
                }else{
                    System.out.println("Найдены следующие совпадения: ");

                    for (Cinema с : filmName) {
                        System.out.println(getAllInfo(с.id));
                    }

                    break;
                }
            }
        }
    }
}

class Db {
    ArrayList<Cinema> films = new ArrayList<>();
    ArrayList<FilmProducer> prod = new ArrayList<>();
    ArrayList<Genre> genres = new ArrayList<>();

    public void addFilmProducer(FilmProducer producer) {
        prod.add(producer);
    }
}

class Cinema {
    int id;
    int filmProd;
    String name;
    int genre;

    public Cinema(int id, String name, int genre, int filmProd) {
        this.id = id;
        this.filmProd = filmProd;
        this.name = name;
        this.genre = genre;
    }
}

class FilmProducer {
    int id;
    String titleName;
}

class Genre {
    int id;
    String name;

    public Genre(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class FilmProducerFactory {
    int count = 1;

    public FilmProducer getFilmProducer(String name) {
        FilmProducer fp = new FilmProducer();
        fp.id = count++;
        fp.titleName = name;
        return fp;
    }
}