package model;

public class MovieStar extends FamousHuman {
    private String movieGenre;
    private String theMovieFamousFor;

    public MovieStar(String name, String surname, int birthDate, String movieGenre, String theMovieFamousFor) {
        super(name, surname, birthDate);
        this.movieGenre = movieGenre;
        this.theMovieFamousFor = theMovieFamousFor;
    }

    @Override
    public String toString() {
        return super.toString() + " " + this.movieGenre + " " + this.theMovieFamousFor;
    }
}
