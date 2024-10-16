package Zoo;

import java.util.HashSet;
import java.util.Set;

public class ZooArea {
    private String name;
    private int maxCapacity;
    private HashSet<Animal> animalList;

    public ZooArea(String name, int maxCapacity){
        this.name = name;
        this.maxCapacity = maxCapacity;
        this.animalList = new HashSet<Animal>();
    }

    public boolean addAnimals(Animal animal){
        if(this.animalList.size() == this.maxCapacity){
            System.out.println("Max Capacity Reached");
            return false;
        }else{
            this.animalList.add((animal));
            return true;
        }
    }

    public Set<Animal> getAnimalsInZoo(){
        return this.animalList;
    }

    public int getOccupancy(){
        return this.animalList.size();
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public String getName() {
        return name;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public void setName(String name) {
        this.name = name;
    }
}
