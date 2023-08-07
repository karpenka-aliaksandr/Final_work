package Models.Nursery.Animals.Groups;

import java.time.LocalDate;
import java.util.ArrayList;

import Models.Nursery.Animals.Groups.Base.Animal;

public abstract class Pet extends Animal {
    protected String type;
    

    public Pet(String name, LocalDate dateOfBirth, ArrayList<String> command) {
        super(name, dateOfBirth, command);
        this.type = "pet";

    }

    @Override
    public String toString() {
        return getInfo();
    }

    public String getInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("type %s, ", this.type));
        sb.append(super.getInfo());
        return sb.toString();
    }
}