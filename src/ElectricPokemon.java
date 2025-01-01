import java.util.Arrays;
import java.util.List;

public class ElectricPokemon extends Pokemon {

    private static final List<String> attacks = Arrays.asList("thunderPunch", "electroBall", "thunder", "voltTackle");

    private static final String type = "electric";

    public ElectricPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, type);
    }

    public List<String> getAttacks() {
        return attacks;
    }

    void thunderPunch(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with thunderPunch.");
        int damage = switch (enemy.getType()) {
            case "water" -> 30;
            case "grass" -> 20;
            case "fire" -> 15;
            case "electric" -> 10;
            default -> 0;
        };

        enemy.setHp(enemy.getHp() - damage);
        System.out.println(enemy.getName() + " loses " + damage + " hp.");
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " left.");
    }

    void voltTackle(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with voltTackle.");
        int damage = switch (enemy.getType()) {
            case "water" -> 30;
            case "grass" -> 20;
            case "fire" -> 15;
            case "electric" -> 10;
            default -> 0;
        };

        enemy.setHp(enemy.getHp() - damage);
        System.out.println(enemy.getName() + " loses " + damage + " hp.");
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " left.");
    }

    void electroBall(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with electroBall.");
        int damage = switch (enemy.getType()) {
            case "water" -> 30;
            case "grass" -> 20;
            case "fire" -> 15;
            case "electric" -> 10;
            default -> 0;
        };

        enemy.setHp(enemy.getHp() - damage);
        System.out.println(enemy.getName() + " loses " + damage + " hp.");
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " left.");
    }


    void thunder(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with thunder.");
        int damage = switch (enemy.getType()) {
            case "water" -> 30;
            case "grass" -> 20;
            case "fire" -> 15;
            case "electric" -> -10;
            default -> 0;
        };

        enemy.setHp(enemy.getHp() - damage);
        System.out.println(enemy.getName() + " loses " + damage + " hp.");
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " left.");
    }
}


