package activities;

public class WalkQuietly implements WalkBehavior{
    @Override
    public void walk() {
        System.out.println("I'm walking quietly.");
    }
}
