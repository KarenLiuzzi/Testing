package pairProgramming;

public class Monkey extends Animal{

    static int totalMonkeys = 0;

    public Monkey(String name, String breed){
        super(name,breed);

        Monkey.totalMonkeys++;
    }

    @Override
    public void makeSound() {
        System.out.println(this.name + " is Hooting!");
    }
}