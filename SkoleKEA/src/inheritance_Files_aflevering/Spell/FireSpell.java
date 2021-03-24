package inheritance_Files_aflevering.Spell;

public class FireSpell extends Spell { // jeg extender spell for at arve fra Classen "Spell"
    // min attribute der gør FireSpell anderledes fra "Spell"
    private double damageEverySecond;

    // constructor til at oprette en FireSpell
    public FireSpell(String color, double damage, double manaCost, double cooldown) {
        // super Classen er "Spell" som er den min class arver fra (inherritance)
        super(color, damage, manaCost, cooldown);
        this.damageEverySecond = (damage / 100) * 10;

    }
    // laver min useSpell Specifik for fireSpells
    @Override
    public void useSpell() {

        System.out.println("you shoot a " + super.getColor() + " Fire Spell" );
        System.out.println("You dealt " + super.getDamage() + " Damage");
        System.out.println("ManaCost is " + super.getManaCost());
        System.out.println("your target is taking " + damageEverySecond + "Damage every second for 3 seconds");

    }
    // overrider da min spell har damage over time Attribute
    @Override
    public double damagePerManaSpent() {
        return super.damagePerManaSpent() + (damageEverySecond * 3)/ getManaCost();
    }
}
