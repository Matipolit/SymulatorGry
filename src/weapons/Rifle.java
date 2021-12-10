package weapons;

import abc.Weapon;

public class Rifle extends Weapon {
    @Override
    public void display() {
        System.out.println("It's a rifle!");
    }
}
