public class ElfKickStrategy implements KickStrategy{
    @Override
    public void kick(Character attacker, Character defender) {
        if (defender.getPower() < attacker.getPower()) {
            defender.setHp(0);
        } else {
            defender.decreasePower();
        }
    }
}
