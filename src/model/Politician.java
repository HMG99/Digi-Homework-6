package model;

public class Politician extends FamousHuman {

    private String position;
    private String country;

    public Politician(String name, String surname, int birthDate, String position, String country) {
        super(name, surname, birthDate);
        this.position = position;
        this.country = country;
    }

    @Override
    public String toString() {
        return super.toString() + " " + position + " " + country;
    }
}
