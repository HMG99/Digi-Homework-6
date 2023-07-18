package model;

public class FamousHuman {
    private String name;
    private String surname;
    private int birthDate;

    public FamousHuman(String name, String surname, int birthDate) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return this.name + " " + this.surname + " " + this.birthDate;
    }
}
