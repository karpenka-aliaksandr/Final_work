package Models.Nursery;


import java.util.ArrayList;

import Models.Nursery.Animals.Groups.Base.Animal;

public class Nursery {
    private ArrayList<Animal> nursery;

    public Nursery() {
        this.nursery = new ArrayList<>();
    }

    public void add(Animal animal){
        nursery.add(animal);
    }

    public void remove(int index){
        nursery.remove(index);
    }

    public StringBuilder printInfo(int index){
        return new StringBuilder (nursery.get(index).getInfo());
    }

    // public String makeSound(int index){
    //     return nursery.get(index).makeSound();
    // }

    public StringBuilder printInfoAll(){
        StringBuilder sb = new StringBuilder();
        for (int index = 0; index < this.nursery.size(); index++) {
            sb.append(printInfo(index)+"\n");
        }
        return sb;
    }

    // public String makeSoundAll(){
    //     StringBuilder sb = new StringBuilder();
    //     for (int index = 0; index < this.nursery.size(); index++) {
    //         sb.append(makeSound(index)+"\n");
    //     }
    //     return sb.toString();
    // }

    public boolean isEmpty(){
        return this.nursery.isEmpty();
    }
 
    // public void addPropertyChangeListener(PropertyChangeListener pcl) {
    //     support.addPropertyChangeListener(pcl);
    // }

    // public void removePropertyChangeListener(PropertyChangeListener pcl) {
    //     support.removePropertyChangeListener(pcl);
    // }

    // public void setNotufy(String value) {
    //     support.firePropertyChange("nursery", this.notyfy, value);
    //     this.notyfy = value;
    // }
    public int getCount(){
        return nursery.size();
    }


}
