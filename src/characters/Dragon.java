package characters;

import abc.Character;
import weapons.FireStream;

public class Dragon extends Character {
    public Dragon(String name) {
        super(name);
        health = 50;
        giveWeapon(new FireStream());
    }
}
