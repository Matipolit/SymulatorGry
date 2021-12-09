package weapons;

public class Sword extends abc.Weapon {

    public Sword(){

    }

    @Override
    public void display() {
        System.out.println("      /| ________________\n" +
                "O|===|* >________________>\n" +
                "      \\|");
    }
}
