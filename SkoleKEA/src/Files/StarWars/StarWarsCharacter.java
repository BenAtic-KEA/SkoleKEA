package Files.StarWars;

public class StarWarsCharacter {
    private String name;
    private int height;
    private double mass;
    private String hairColor;
    private String eyeColor;
    private String birthYear;
    private String gender;
    private String homeWorld;
    private String species;

    public StarWarsCharacter(String name, int height, double mass, String hairColor, String eyeColor,
                             String birthYear, String gender, String homeWorld, String species){

        this.name = name;
        this.height = height;
        this.mass = mass;
        this.hairColor = hairColor;
        this.eyeColor = eyeColor;
        this.birthYear = birthYear;
        this.gender = gender;
        this.homeWorld = homeWorld;
        this.species = species;

    }

    public String getName() {
        return name;
    }

    public String getHomeWorld() {
        return homeWorld;
    }

    public String getSpecies() {
        return species;
    }

    public double getMass() {
        return mass;
    }

    public int getHeight() {
        return height;
    }

    public String getGender() {
        return gender;
    }
}
