package inheritance_Files_aflevering.Spell;

public class FrostSpell extends Spell {

    private double slowSpeed;

    // slowSpeed = fra 1-100(%)
    public FrostSpell(String color, double damage, double manaCost, double cooldown, double slowSpeed) {
        super(color, damage, manaCost, cooldown);
        this.slowSpeed = slowSpeed;
    }

    // laver min useSpell Specifik for FrostSpells
    @Override
    public void useSpell() {
        System.out.println("you shoot a " + super.getColor() + " Frost Spell" );
        System.out.println("You dealt " + super.getDamage() + " Damage");
        System.out.println("ManaCost is " + super.getManaCost());
        System.out.println("your target is slowed by " + slowSpeed + "%" + "for 1.5 seconds");

    }

}
