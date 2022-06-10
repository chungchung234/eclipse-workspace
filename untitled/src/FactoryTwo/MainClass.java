package FactoryTwo;

import FactoryTwo.person.Person;
import FactoryTwo.types.AbstratsItem;
import FactoryTwo.types.Atype;
import FactoryTwo.types.Btype;

import java.util.ArrayList;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
//        Person person = new Person();
//
//        person.create(new Atype());
//        person.m_weapon.drawWeapon();
//        person.m_bomb.drawBomb();

        List<Person> list = new ArrayList<>();
        Person person = new Person();


        AbstratsItem item = null;

        item = new Atype();
        person.create(item);
        list.add(person);

        list.add(person);
        item = new Btype();
        person.create(item);
        list.add(person);
        for(Person p : list){
            p.m_weapon.drawWeapon();
            p.m_bomb.drawBomb();

        }

    }
}
