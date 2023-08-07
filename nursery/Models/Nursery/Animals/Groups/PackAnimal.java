package Models.Nursery.Animals.Groups;

import java.time.LocalDate;
import java.util.ArrayList;

import Models.Nursery.Animals.Groups.Base.Animal;

public abstract class PackAnimal extends Animal {
    protected String type;
    

    public PackAnimal(String name, LocalDate dateOfBirth, ArrayList<String> command) {
        super(name, dateOfBirth, command);
        this.type = "PackAnimal";

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