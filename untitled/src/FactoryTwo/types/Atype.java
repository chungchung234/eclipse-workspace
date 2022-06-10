package FactoryTwo.types;

import FactoryTwo.Bomb.Bomb;
import FactoryTwo.Bomb.C4;
import FactoryTwo.Weapon.Sword;
import FactoryTwo.Weapon.Weapon;

public class Atype implements AbstratsItem{
    @Override
    public Weapon creatWeapon() {
        return new Sword();
    }

    @Override
    public Bomb creatBomb() {
        return new C4();
    }
}
