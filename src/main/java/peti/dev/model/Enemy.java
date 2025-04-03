package peti.dev.model;

public class Enemy extends Entity {
    public Enemy(String name, int hp, int damage) {
        super(name, hp, damage);
    }

    public Enemy(String name) {
        super(name);
    }

    public Enemy() {
    }
}
