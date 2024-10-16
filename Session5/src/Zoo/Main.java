package Zoo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Hello and welcome to our zoo!");
        HashSet<ZooArea> myZooArea = new HashSet<ZooArea>();
        HashSet<Bird> myBirds = new HashSet<Bird>();
        HashSet<Bear> myBears= new HashSet<Bear>();
        Zoo zoo = new Zoo("Jorge and Karen's Zoo");

        /*Zoo Areas*/
        try {
            BufferedReader readerZooArea = new BufferedReader(new FileReader("zooAreas.csv"));
            readerZooArea.readLine();
            String[] areasStr = new String[10];
            String lineArea = readerZooArea.readLine();

            while (lineArea != null){
                areasStr = lineArea.split(";");
                ZooArea birdArea = new ZooArea(areasStr[0], Integer.parseInt(areasStr[1]));
                myZooArea.add(birdArea);
                lineArea = readerZooArea.readLine();

            }
        }
        catch (IOException e) {
            System.out.println("An error ocurred reading the file: " + e.getMessage());
        }

        /*Animals*/
        try {
            BufferedReader readerAnimals = new BufferedReader(new FileReader("animals.csv"));
            readerAnimals.readLine();
            String[] animalsStr = new String[10];
            String lineAnimal = readerAnimals.readLine();

            while (lineAnimal != null){
                animalsStr = lineAnimal.split(";");
                if(animalsStr[0].equals("Bird")){
                    Bird bird = new Bird(animalsStr[0], animalsStr[1], animalsStr[2], Integer.parseInt(animalsStr[3]));
                    myBirds.add(bird);
                } else if (animalsStr[0].equals("Bear")) {
                    Bear bear = new Bear(animalsStr[0], animalsStr[1], animalsStr[2], Integer.parseInt(animalsStr[3]));
                    myBears.add(bear);
                }
                lineAnimal = readerAnimals.readLine();

            }
        }
        catch (IOException e) {
            System.out.println("An error ocurred reading the file: " + e.getMessage());
        }

        for(ZooArea area: myZooArea){
            if(area.getName().contains("Bird")){
                for(Bird bird: myBirds){
                    if(!area.addAnimals(bird)){
                        break;
                    };
                }
            } else if (area.getName().contains("Bear")) {
                for(Bear bear: myBears){
                    if(!area.addAnimals(bear)){
                        break;
                    };
                    area.addAnimals(bear);
                }
            };
            zoo.addZooArea(area);
        };
        zoo.printZooStatus();

    }
}