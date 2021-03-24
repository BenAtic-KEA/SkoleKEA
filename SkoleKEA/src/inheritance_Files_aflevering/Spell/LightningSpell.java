package inheritance_Files_aflevering.Spell;

import java.util.Random;

public class LightningSpell extends Spell {

    private int stunChance;
    // constructor til at oprette en lightningSpell med stunchance
    public LightningSpell(String color, double damage, double manaCost, double cooldown) {
        super(color, damage, manaCost, cooldown);
        this.stunChance = 20; // percentage chance
    }

    // laver min useSpell Specifik for LightningSpells
    @Override
    public void useSpell() {
        System.out.println("you shoot a " + super.getColor() + " Lightning Spell" );
        System.out.println("You dealt " + super.getDamage() + " Damage");
        System.out.println("ManaCost is " + super.getManaCost());

        Random stunchanceProc = new Random();

        int numberOfOutcomes = 100 / stunChance;

        int stun = stunchanceProc.nextInt(numberOfOutcomes) ;

        if(stun == 1){
            System.out.println("target stunned!");
        }
    }
}
