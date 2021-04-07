package inheritance_Files_aflevering.Exercise2;

public class SpellCaster {

    public static void main(String[] args) {

        LightningSpell thunder = new LightningSpell("Yellow",25,45,2);

        thunder.useSpell();

        System.out.println(thunder.damagePerManaSpent());

        FrostSpell iceShard = new FrostSpell("Blue",20,20,1,20);

        iceShard.useSpell();
        System.out.println(iceShard.damagePerManaSpent());

        FireSpell fireball = new FireSpell("Red",45,40,2.5);

        fireball.useSpell();
        System.out.println(fireball.damagePerManaSpent());

    }


}
