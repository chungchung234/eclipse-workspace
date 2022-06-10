package FactoryTwo.person;

import FactoryTwo.Bomb.Bomb;
import FactoryTwo.Weapon.Weapon;
import FactoryTwo.types.AbstratsItem;

public class Person {
    public Weapon m_weapon;
    public Bomb m_bomb;
    public void create(AbstratsItem ai){
        m_weapon=ai.creatWeapon();
        m_bomb=ai.creatBomb();
    }
}
