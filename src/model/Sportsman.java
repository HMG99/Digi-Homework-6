package model;

public class Sportsman extends FamousHuman {
    private String sportType;

    public Sportsman(String name, String surname, int birthdate, String sportType) {
        super(name, surname, birthdate);
        this.sportType = sportType;
    }

    @Override
    public String toString() {
        return super.toString() + " " + sportType;
    }
}
