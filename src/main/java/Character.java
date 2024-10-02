
abstract class Character {
    protected int power;
    protected int hp;
    protected KickStrategy kickStrategy;

    public Character(int power, int hp, KickStrategy kickStrategy) {
        this.power = power;
        this.hp = hp;
        this.kickStrategy = kickStrategy;
    }

    public void kick(Character defender) {
        kickStrategy.kick(this, defender);
    }

    public boolean isAlive() {
        return this.hp > 0;
    }

    public int getPower() {
        return power;
    }

    public int getHp() {
        return hp;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setHp(int hp) {
        if (hp<0) {
            this.hp=0;
        } else {
            this.hp = hp;
        }
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{hp=" + hp + ", power=" + power + "}";
    }

    public void printStatus() {
        System.out.println(this);
    }

    public void decreasePower() {
        power--;
    }

}
