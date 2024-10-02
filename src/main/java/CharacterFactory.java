
public class CharacterFactory {
    public Character createCharacter(String type) {
        switch (type) {
            case "Hobbit":
                return new Hobbit();
            case "Elf":
                return new Elf();
            case "King":
                return new King();
            case "Knight":
                return new Knight();
            default:
                throw new IllegalArgumentException("Unknown character type");
        }
    }
}
