package Models.Nursery.Animals;

import java.time.LocalDate;
import java.util.ArrayList;

import Models.Nursery.Animals.Groups.PackAnimal;

public class Donkey extends PackAnimal{
    private String group;

    public Donkey(String name, LocalDate dateOfBirth, ArrayList<String> command) {
        super(name, dateOfBirth, command);
        this.group = "Donkey";
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