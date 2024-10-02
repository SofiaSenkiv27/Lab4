
abstract class Character {
    protected int power;
    protected int hp;

    public Character(int power, int hp) {
        this.power = power;
        this.hp = hp;
    }

    public abstract void kick(Character c);

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

}
