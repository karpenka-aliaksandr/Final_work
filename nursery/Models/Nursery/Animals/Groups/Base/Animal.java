package Models.Nursery.Animals.Groups.Base;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Animal {
    protected String name;
    protected LocalDate dateOfBirth;
    protected ArrayList<String> commands;


   


    public Animal(String name, LocalDate dateOfBirth, ArrayList<String> commands) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.commands = commands;
    }

    @Override
    public String toString() {
        return getInfo();
    }

    public String getInfo(){
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("name: %.2f, date of birth: %s", name, dateOfBirth));
        return sb.toString();      
    }
    public String showCommands() {
        StringBuilder sb = new StringBuilder();
        sb.append("commands: ");
        for (String st: commands)
            sb.append(String.format("%s  ", st));
        return sb.toString();  
    };
    public void addCommand(String command){
        this.commands.add(command);
    }
}
