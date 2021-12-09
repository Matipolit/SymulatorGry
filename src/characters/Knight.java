package characters;

import weapons.Sword;

public class Knight extends abc.Character {

    public Knight(String name) {
        super(name);
        super.health = 10;
        super.giveWeapon(new Sword());
    }



}
