package weapons;

import abc.Weapon;

public class FireStream extends Weapon {

    public FireStream(){

    }

    @Override
    public void display() {
        System.out.println("It's a fire stream!");
    }
}
