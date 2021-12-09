package activities;

public class Fly implements WalkBehavior {
    @Override
    public void walk() {
        System.out.println("I'm flying");
    }
}
