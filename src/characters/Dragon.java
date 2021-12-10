package characters;

import abc.Character;
import activities.Fly;
import weapons.FireStream;

public class Dragon extends Character {
    public Dragon(String name) {
        super(name);
        health = 50;
        giveWeapon(new FireStream());
        setWalkBehavior(new Fly());
    }
}
