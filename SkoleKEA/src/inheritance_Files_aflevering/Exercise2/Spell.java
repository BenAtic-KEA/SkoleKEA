package inheritance_Files_aflevering.Exercise2;

public abstract class Spell {

    // jeg laver de attributes som alle "spells" har tilfældes
    private String color;
    private double damage;
    private double manaCost;
    private double cooldown;

    // laver en constructor for mine spells
    public Spell(String color, double damage, double manaCost, double cooldown){

        this.color = color;
        this.damage = damage;
        this.manaCost = manaCost;
        this.cooldown = cooldown;
    }

    public double damagePerManaSpent(){
        return damage / manaCost;
    }
    // laver en abstract metode, da alle mine spells skal kunne bruges
    // (en kontrakt med at alle mine spells skal indeholde en useSpell();)
    public abstract void useSpell();

    public double getCooldown() {
        return cooldown;
    }

    public double getDamage() {
        return damage;
    }

    public double getManaCost() {
        return manaCost;
    }

    public String getColor() {
        return color;
    }
}
