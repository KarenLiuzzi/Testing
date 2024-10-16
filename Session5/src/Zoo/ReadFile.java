package Zoo;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    public static void main1(String[] args){
        /*ANIMALS*/
    try {
        BufferedWriter writerAnimals = new BufferedWriter(new FileWriter("animals.csv"));
        writerAnimals.write("Animals");
        List<String> animals = new ArrayList<>();
        animals.add("\nBird;Bridled Titmouse;Lulu;2015;Bird Area");
        animals.add("\nBird;Budgerigars;Lili;2010;Bird Area");
        animals.add("\nBird;African Gray Parrot;Pepi;2009;Bird Area");
        animals.add("\nBird;Amazon Parrots;Lolo;2021;Bird Area");
        animals.add("\nBear;Polar;Yogi;2022;Bear Area");
        animals.add("\nBear;Grizzly;Bubu;2023;Bear Area");
        animals.add("\nBear;Brown Bear;Urus;2010;Bear Area");
        animals.add("\nBear;Asiatic black bear;Moon;2008;Bear Area");
        for (String animal : animals) {
            writerAnimals.write(animal);
        }
        writerAnimals.close();
    } catch(IOException e){
        throw new RuntimeException(e);
    }
    try {
        BufferedReader readerAnimals = new BufferedReader(new FileReader("animals.csv"));
        readerAnimals.readLine();
        String[] animalsStr = new String[10];
        String lineAnimal = readerAnimals.readLine();

        while (lineAnimal != null){
            animalsStr = lineAnimal.split(";");
            System.out.println(animalsStr[0] + " " + animalsStr[1] + " " + animalsStr[2] + " " + animalsStr[3]);
            lineAnimal = readerAnimals.readLine();

        }
    }
    catch (IOException e) {
        System.out.println("An error ocurred reading the file: " + e.getMessage());
    }
    /*ZOO AREAS*/
    try {
        BufferedWriter writerZooArea = new BufferedWriter(new FileWriter("zooAreas.csv"));
        writerZooArea.write("Zoo Areas");
        List<String> zooArea = new ArrayList<>();
        zooArea.add("\nBird Area;3");
        zooArea.add("\nBear Area;4");
        for (String area : zooArea) {
            writerZooArea.write(area);
        }
        writerZooArea.close();
    } catch(IOException e){
        throw new RuntimeException(e);
    }
    try {
        BufferedReader readerZooArea = new BufferedReader(new FileReader("zooAreas.csv"));
        readerZooArea.readLine();
        String[] areasStr = new String[10];
        String lineArea = readerZooArea.readLine();

        while (lineArea != null){
            areasStr = lineArea.split(";");
            System.out.println(areasStr[0] + " " + areasStr[1]);
            lineArea = readerZooArea.readLine();

        }
    }
    catch (IOException e) {
        System.out.println("An error ocurred reading the file: " + e.getMessage());
    }
    }
}