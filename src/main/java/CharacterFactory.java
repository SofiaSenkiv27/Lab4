
import java.util.Random;
class CharacterFactory {
    public Character createCharacter() {
        Random rand = new Random();
        int characterType = rand.nextInt(5);
        switch (characterType) {
            case 0: return new Hobbit();
            case 1: return new Elf();
            case 2: return new King();
            case 3: return new Knight();
            default: return new Hobbit();
        }
    }
}
