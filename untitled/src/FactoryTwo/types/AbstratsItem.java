package FactoryTwo.types;

import FactoryTwo.Bomb.Bomb;
import FactoryTwo.Weapon.Weapon;

public interface AbstratsItem {
    public Weapon creatWeapon();
    public Bomb creatBomb();
}
