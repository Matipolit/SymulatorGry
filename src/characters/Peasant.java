package characters;

import activities.Walk;
import weapons.Pitchfork;

public class Peasant extends abc.Character{

    public Peasant(String name) {
        super(name);
        super.health = 5;
        super.giveWeapon(new Pitchfork());
        setWalkBehavior(new Walk());
    }

}
