import java.util.Arrays;
import java.util.List;

public class FirePokemon extends Pokemon {

    private static final List<String> attacks = Arrays.asList("fireLash", "flameThrower", "pyroBall", "inferno");

    private static final String type = "fire";

    public FirePokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, type);
    }

    public List<String> getAttacks() {
        return attacks;
    }

    void fireLash(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with fireLash.");
        int damage = switch (enemy.getType()) {
            case "grass" -> 30;
            case "water" -> 20;
            case "electric" -> 15;
            case "fire" -> 10;
            default -> 0;
        };

        enemy.setHp(enemy.getHp() - damage);
        System.out.println(enemy.getName() + " loses " + damage + " hp.");
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " left.");
    }


    void flameThrower(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with flameThrower.");
        int damage = switch (enemy.getType()) {
            case "grass" -> 30;
            case "water" -> 20;
            case "electric" -> 15;
            case "fire" -> 10;
            default -> 0;
        };

        enemy.setHp(enemy.getHp() - damage);
        System.out.println(enemy.getName() + " loses " + damage + " hp.");
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " left.");
    }


    void pyroBall(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with pyroBall.");
        int damage = switch (enemy.getType()) {
            case "grass" -> 30;
            case "water" -> 20;
            case "electric" -> 15;
            case "fire" -> 10;
            default -> 0;
        };

        enemy.setHp(enemy.getHp() - damage);
        System.out.println(enemy.getName() + " loses " + damage + " hp.");
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " left.");
    }


    void inferno(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with inferno.");
        int damage = switch (enemy.getType()) {
            case "grass" -> 30;
            case "water" -> 20;
            case "electric" -> 15;
            case "fire" -> 10;
            default -> 0;
        };

        enemy.setHp(enemy.getHp() - damage);
        System.out.println(enemy.getName() + " loses " + damage + " hp.");
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " left.");
    }

}