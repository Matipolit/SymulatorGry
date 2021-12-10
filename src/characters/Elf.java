package characters;

import abc.Character;
import activities.WalkTactically;
import weapons.Bow;

public class Elf extends Character {
    public Elf(String name) {
        super(name);
        super.health = 7;
        super.giveWeapon(new Bow());
        super.setWalkBehavior(new WalkTactically());
    }
}
