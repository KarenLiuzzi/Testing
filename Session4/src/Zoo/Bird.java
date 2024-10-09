package Zoo;

public class Bird implements Animal{

    private String specie;
    private String breed;
    private String name;
    private int birthYear;


    public Bird(String specie, String breed, String name, int birthYear){
        this.specie = specie;
        this.breed = breed;
        this.name = name;
        this.birthYear = birthYear;
    }

    public void setSpecie(String specie) {
        this.specie = specie;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    @Override
    public String getSpecie(){
        return specie;
    }

    @Override
    public String getBreed(){
        return breed;
    }

    @Override
    public String getName(){
        return name;
    }

    @Override
    public int getBirthYear(){
        return birthYear;
    }
}
