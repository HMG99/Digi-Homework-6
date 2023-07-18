import model.MovieStar;
import model.Politician;
import model.Singer;
import model.Sportsman;

import javax.swing.*;

public class Lesson {
    public static void main(String[] args) {

        MovieStar moviestar1 = new MovieStar("Tom", "Cruise", 1962, "action",
                "Mission Impossible");
        MovieStar moviestar2 = new MovieStar("Keanu", "Reeves", 1964, "action",
                "Matrix");
        MovieStar moviestar3 = new MovieStar("Chris", "Evans", 1981, "action",
                "Avengers");

        MovieStar[] movieStars = new MovieStar[]{moviestar1, moviestar2, moviestar3};

        for (MovieStar actor : movieStars) {
            System.out.println(actor);
        }
        System.out.println();


        Politician politician1 = new Politician("Vladimir", "Putin", 1952, "President",
                "Russia");
        Politician politician2 = new Politician("Donald", "Trump", 1946, "President",
                "USA");
        Politician politician3 = new Politician("Nikol", "Pashinyan", 1975, "President",
                "Armenia");

        Politician[] politicians = new Politician[]{politician1, politician2, politician3};

        for (Politician pol : politicians) {
            System.out.println(pol);
        }
        System.out.println();


        Singer singer1 = new Singer("Jennifer", "Lopez", 1969, "pop");
        Singer singer2 = new Singer("Brian ", "Johnson", 1947, "rock");
        Singer singer3 = new Singer("James ", "Jackson ", 1947, "rap");

        Singer[] singers = new Singer[]{singer1, singer2, singer3};

        for(Singer singer : singers) {
            System.out.println(singer);
        }
        System.out.println();


        Sportsman sportsman1 = new Sportsman("Mike", "Tyson", 1966, "Boxing");
        Sportsman sportsman2 = new Sportsman("Ronaldo", "Cristiano", 1985, "Soccer");
        Sportsman sportsman3 = new Sportsman("Dwayne", "Johnson", 1972, "Wrestling");

        Sportsman[] sportsmen = new Sportsman[]{sportsman1, sportsman2, sportsman3};

        for(Sportsman sportsman : sportsmen) {
            System.out.println(sportsman);
        }


    }
}
