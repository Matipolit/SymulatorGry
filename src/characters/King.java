package characters;

import abc.Character;
import activities.Walk;
import weapons.Sword;

public class King extends Character {

    public King(String name){
        super(name);
        super.health = 20;
        super.giveWeapon(new Sword());
        setWalkBehavior(new Walk());

    }

}
