import java.util.Arrays;
import java.util.List;

public class WaterPokemon extends Pokemon {

    private static final List<String> attacks = Arrays.asList("surf", "hydroPump", "hydroCanon", "rainDance");

    private static final String type = "water";

    public WaterPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, type);
    }

    public List<String> getAttacks() {
        return attacks;
    }

    void surf(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with surf.");
        int damage = switch (enemy.getType()) {
            case "fire" -> 30;
            case "electric" -> 20;
            case "grass" -> 15;
            case "water" -> 10;
            default -> 0;
        };

        enemy.setHp(enemy.getHp() - damage);
        System.out.println(enemy.getName() + " loses " + damage + " hp.");
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " left.");
    }

    void hydroPump(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with hydroPump.");
        int damage = switch (enemy.getType()) {
            case "fire" -> 30;
            case "electric" -> 20;
            case "grass" -> 15;
            case "water" -> 10;
            default -> 0;
        };

        enemy.setHp(enemy.getHp() - damage);
        System.out.println(enemy.getName() + " loses " + damage + " hp.");
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " left.");

    }

    void hydroCanon(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with hydroCanon.");
        int damage = switch (enemy.getType()) {
            case "fire" -> 30;
            case "electric" -> 20;
            case "grass" -> 15;
            case "water" -> 10;
            default -> 0;
        };

        enemy.setHp(enemy.getHp() - damage);
        System.out.println(enemy.getName() + " loses " + damage + " hp.");
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " left.");
    }

    void rainDance(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with rainDance.");
        int damage = switch (enemy.getType()) {
            case "fire" -> 30;
            case "grass" -> -15;
            case "water" -> 10;
            default -> 0;
        };
        if (damage == 0){System.out.println("Rain dance has no effect on " + enemy.getName());}

        enemy.setHp(enemy.getHp() - damage);
        System.out.println(enemy.getName() + " loses " + damage + " hp.");
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " left.");
    }

}



