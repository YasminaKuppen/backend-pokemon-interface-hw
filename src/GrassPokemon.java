import java.util.Arrays;
import java.util.List;

public class GrassPokemon extends Pokemon {

    private static final List<String> attacks = Arrays.asList("leafStorm", "leechSeed", "leaveBlade", "solarBeam");

    private static final String type = "grass";

    public GrassPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, type);
    }

    public List<String> getAttacks() {
        return attacks;
    }

    public void leafStorm(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with leafstorm.");
        int damage = switch (enemy.getType()) {
            case "electric" -> 30;
            case "fire" -> 20;
            case "water" -> 15;
            case "grass" -> 10;
            default -> 0;
        };

        enemy.setHp(enemy.getHp() - damage);
        System.out.println(enemy.getName() + " loses " + damage + " hp.");
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " left.");

    }

    public void leechSeed(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with leechSeed.");
        int damage = switch (enemy.getType()) {
            case "electric" -> 30;
            case "fire" -> 20;
            case "water" -> 15;
            case "grass" -> 10;
            default -> 0;
        };

        enemy.setHp(enemy.getHp() - damage);
        name.setHp(name.getHp() + damage);
        System.out.println(enemy.getName() + " loses " + damage + " hp.");
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " left.");


    }

    public void leaveBlade(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with leaveBlade.");
        int damage = switch (enemy.getType()) {
            case "electric" -> 30;
            case "fire" -> 20;
            case "water" -> 15;
            case "grass" -> 10;
            default -> 0;
        };

        enemy.setHp(enemy.getHp() - damage);
        System.out.println(enemy.getName() + " loses " + damage + " hp.");
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " left.");

    }

    public void solarBeam(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with solarBeam.");
        int damage = switch (enemy.getType()) {
            case "electric" -> 30;
            case "fire" -> 20;
            case "water" -> 15;
            case "grass" -> 10;
            default -> 0;
        };

        enemy.setHp(enemy.getHp() - damage);
        System.out.println(enemy.getName() + " loses " + damage + " hp.");
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " left.");

    }
}
