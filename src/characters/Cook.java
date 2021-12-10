package characters;

import abc.Character;
import activities.Walk;
import weapons.Spoon;

public class Cook extends Character{
    public Cook(String name) {
        super(name);
        super.health = 8;
        super.giveWeapon( new Spoon());
        super.setWalkBehavior(new Walk());
    }
}
