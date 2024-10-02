
import java.util.Random;
class King extends Character{
    public King() {
        super(new Random().nextInt(11)+5, new Random().nextInt(11)+5);
    }

    @Override
    public void kick(Character c) {
        int damage = new Random().nextInt(this.power)+1;
        c.hp-=damage;
        if (c.hp<0) c.hp=0;
    }
}
