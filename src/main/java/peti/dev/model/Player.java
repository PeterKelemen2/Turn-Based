package peti.dev.model;

public class Player extends Entity{
    public Player(String name, int hp, int damage) {
        super(name, hp, damage);
    }

    public Player(String name) {
        super(name);
    }

    public Player() {
    }
}
