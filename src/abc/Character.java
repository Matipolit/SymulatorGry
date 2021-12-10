package abc;

import abc.Weapon;
import activities.WalkBehavior;

public abstract class Character {

    private String name;
    protected int health;
    private Weapon weapon;
    private WalkBehavior walkBehavior;

    public Character(String name){
        this.name = name;
    }

    public void walk(){
        walkBehavior.walk();
    }
    public void displayWeapon(){
        weapon.display();
    }
    public void giveWeapon(Weapon weapon){
        this.weapon = weapon;
    }
    protected void setWalkBehavior(WalkBehavior wb){
        this.walkBehavior = wb;
    }
    public void introduceYourself() { System.out.println("My name is " + name +" .");}


}
