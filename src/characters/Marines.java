package characters;

import abc.Character;
import activities.WalkTactically;
import weapons.Rifle;

public class Marines extends Character {
    public Marines(String name) {
        super(name);
        super.health = 10;
        super.giveWeapon( new Rifle());
        super.setWalkBehavior(new WalkTactically());
    }
}
