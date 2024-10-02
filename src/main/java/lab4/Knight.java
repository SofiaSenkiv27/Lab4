package lab4;
import java.util.Random;
public class Knight extends Character{
    public Knight() {
        super(new Random().nextInt(11) + 2, new Random().nextInt(11) + 2);  // Power and HP between 2 and 12
    }

    @Override
    public void kick(Character c) {
        int damage = new Random().nextInt(this.power)+1;
        c.hp-=damage;
        if (c.hp<0) c.hp=0;
    }
}
