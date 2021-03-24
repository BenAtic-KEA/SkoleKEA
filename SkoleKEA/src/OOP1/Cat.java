package OOP1;

public class Cat {
    String name;
    int mood; // 0 - 10
    int hungry; // 10 er mæt 0 er sulten.
    int energy; // 0 - 10

    public String greet() {

        String catHunger;
        String catHappiness;
        String catEnergy;


        if (hungry >= 5) {
            catHunger = "The cat is not hungry";
        } else {
            catHunger = "The cat is hungry";
        }
        if (mood >= 5) {
            catHappiness = " and the cat is happy";
        } else {
            catHappiness = " and the cat is angry";
        }
        if (energy >= 5) {
            catEnergy = "It keeps running around!";
        } else {
            catEnergy = "Its sleeping";
        }
        return "Cats name is: " + name + "\n" + catHunger + catHappiness +"\n" + catEnergy;
    }

    public Cat(String nameOfCat, int moodOfCat, int hungerOfCat, int energyOfCat){

            this.name = nameOfCat;
            this.mood = moodOfCat;
            this.hungry = hungerOfCat;
            this.energy = energyOfCat;
        }


}
