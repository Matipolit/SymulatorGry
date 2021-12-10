package weapons;

import abc.Weapon;

public class Bow extends Weapon {
    @Override
    public void display() {
        System.out.println("It's a bow!");
    }
}
