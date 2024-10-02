

class GameManager {
    public void fight(Character c1, Character c2) {
        System.out.println("Fight starts between " + c1.getClass().getSimpleName() + " and " + c2.getClass().getSimpleName() + "!");
        

        while (c1.isAlive() && c2.isAlive()) {
            c1.kick(c2);
            if (!c2.isAlive()) {
                System.out.println(c2.getClass().getSimpleName() + " is defeated!");
                break;
            }

            c2.kick(c1);
            if (!c1.isAlive()) {
                System.out.println(c1.getClass().getSimpleName() + " is defeated!");
            }
        }

        System.out.println("Fight is over.");
    }

    public static void main(String[] args) {
        CharacterFactory factory = new CharacterFactory();
        GameManager gameManager = new GameManager();

        Character hero1 = factory.createCharacter();
        Character hero2 = factory.createCharacter();

        gameManager.fight(hero1, hero2);
    }
}
