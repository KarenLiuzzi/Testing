package pairProgramming;

public abstract class Animal {
    String name;
    String breed;
    static int totalAnimals = 0;

    public Animal(String name, String breed){
        this.name = name;
        this.breed = breed;
        Animal.totalAnimals++;
    }
    /*public void makeSound(){
        System.out.print(this.name + "makes a sound!");
    }*/
    public abstract void makeSound();
}