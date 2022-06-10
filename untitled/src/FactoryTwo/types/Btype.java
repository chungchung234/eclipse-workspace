package FactoryTwo.types;

import FactoryTwo.Bomb.Bomb;
import FactoryTwo.Bomb.Dynamite;
import FactoryTwo.Weapon.Gun;
import FactoryTwo.Weapon.Weapon;

public class Btype implements AbstratsItem{
    @Override
    public Weapon creatWeapon() {
        return new Gun();
    }

    @Override
    public Bomb creatBomb() {
        return new Dynamite();
    }
}
