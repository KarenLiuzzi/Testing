package pairProgramming;

public class Bear extends Animal{

    static int bearCount = 0;

    public Bear(String name,String breed) {
        super(name,breed);
        Bear.bearCount++;
    }
    @Override
    public void makeSound() {
        System.out.println(this.name+ " WRAAAWRs");
    }
}