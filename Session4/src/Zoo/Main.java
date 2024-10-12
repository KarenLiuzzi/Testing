package Zoo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Hello and welcome to our zoo!");
        ZooArea birdArea = new ZooArea("Bird Area", 2);
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

        zoo.printZooStatus();

    }
}