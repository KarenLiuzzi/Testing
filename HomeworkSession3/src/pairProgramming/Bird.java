package pairProgramming;

public class Bird extends Animal {

    static int totalBirds = 0;

    public Bird(String name, String breed){
        super(name,breed);
        Bird.totalBirds++;
    }

    @Override
    public void makeSound() {
        System.out.println(this.name + " is Whistling!");
    }

}