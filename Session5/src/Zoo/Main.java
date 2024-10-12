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
                //System.out.println(areasStr[0] + " " + areasStr[1]);
                ZooArea birdArea = new ZooArea(areasStr[0], Integer.parseInt(areasStr[1]));
                myZooArea.add(birdArea);
                lineArea = readerZooArea.readLine();

            }
        }
        catch (IOException e) {
            System.out.println("An error ocurred reading the file: " + e.getMessage());
        }
        /*for(ZooArea area: myZooArea){
            System.out.println(area.getName() + " " + area.getMaxCapacity());
        }*/

        /*Animals*/
        try {
            BufferedReader readerAnimals = new BufferedReader(new FileReader("animals.csv"));
            readerAnimals.readLine();
            String[] animalsStr = new String[10];
            String lineAnimal = readerAnimals.readLine();

            while (lineAnimal != null){
                animalsStr = lineAnimal.split(";");
                //System.out.println(animalsStr[0] + " " + animalsStr[1] + " " + animalsStr[2] + " " + animalsStr[3]);
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
                    //System.out.println(bird.getName() + " " + bird.getBreed() + " " + bird.getSpecie() + " " + bird.getBirthYear());
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
                    //System.out.println(bear.getName() + " " + bear.getBreed() + " " + bear.getSpecie() + " " + bear.getBirthYear());
                }
            };
            zoo.addZooArea(area);
        };
        zoo.printZooStatus();

        /*ZooArea birdArea = new ZooArea("Bird Area", 2);
        ZooArea bearArea = new ZooArea("Bear Area",1);
        Bird bird_1 =  new Bird("Bird", "Bridled Titmouse", "Lulu", 2015);
        Bird bird_2 =  new Bird("Bird", "Budgerigars", "Lili", 2010);
        birdArea.addAnimals(bird_1);
        birdArea.addAnimals(bird_2);
        Bear bear_1 = new Bear("Bear","Polar","Yogi",2023);

        Bear bear_2 = new Bear("Bear","Grizzly","Bubu",2023);
        bearArea.addAnimals(bear_1);
        // this should fail because max capacity is reached.
        bearArea.addAnimals(bear_2);
        Zoo zoo = new Zoo("Jorge and Karen's Zoo");
        zoo.addZooArea(birdArea);
        zoo.addZooArea(bearArea);

        zoo.printZooStatus();*/

    }
}