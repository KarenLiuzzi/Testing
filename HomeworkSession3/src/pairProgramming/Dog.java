package pairProgramming;

public class Dog extends Animal {

    static int dogCount = 0;

    public Dog(String name, String breed){
        super(name,breed);
        Dog.dogCount++;
    }

    @Override
    public void makeSound() {
        System.out.println(this.name+" BARKs");
    }
}