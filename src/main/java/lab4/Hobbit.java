package lab4;

class Hobbit extends Character{
    public Hobbit() {
        super(0, 3);
    }

    @Override
    public void kick(Character c) {
        toCry();
    }

    public void toCry() {
        
    }
}
