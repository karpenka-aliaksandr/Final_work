package Models.Nursery.Animals;

import java.time.LocalDate;
import java.util.ArrayList;

import Models.Nursery.Animals.Groups.PackAnimal;

public class Horse extends PackAnimal{
    private String group;

    public Horse(String name, LocalDate dateOfBirth, ArrayList<String> command) {
        super(name, dateOfBirth, command);
        this.group = "Horse";
    }

    public String getInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("group: %s, ", group));
        sb.append(super.getInfo());
        return sb.toString();
    }

    @Override
    public String toString() {
        return getInfo();
    }


   
}