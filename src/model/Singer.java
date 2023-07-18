package model;

public class Singer extends FamousHuman {

    private String songGenre;

    public Singer(String name, String surname, int birthDate, String songGenre) {
        super(name, surname, birthDate);
        this.songGenre = songGenre;
    }

    @Override
    public String toString() {
        return super.toString() + " " + songGenre;
    }
}
