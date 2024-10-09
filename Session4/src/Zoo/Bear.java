package Zoo;

public class Bear  implements  Animal{

    private String specie;
    private String breed;
    private String name;
    private int birthYear;

    public Bear(String specie, String breed, String name,int birthYear){
        this.specie = specie;
        this.breed = breed;
        this.name = name;
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
        return this.name;
    }

    @Override
    public int getBirthYear(){
        return this.birthYear;
    }
}
