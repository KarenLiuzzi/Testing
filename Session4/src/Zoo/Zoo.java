package Zoo;

import java.util.ArrayList;
import java.util.HashSet;

public class Zoo {

    private String name;
    private ArrayList<ZooArea> zooAreas;

    public Zoo(String name) {
        this.name = name;
        this.zooAreas = new ArrayList<ZooArea>();

    }
    public void printZooStatus(){
        System.out.println("The Zoo " +  this.name + " contains the following:");
        for(ZooArea area:this.zooAreas){
            System.out.println("Zoo Area" + area.getName() + " has " + area.getOccupancy() + " out of " + area.getMaxCapacity() );
            area.getAnimalsInZoo().stream().forEach(animal -> System.out.println(animal.getName()));

        }
    }
    public void addZooArea(ZooArea area){
        this.zooAreas.add(area);
    }
}
