package peti.dev.model;

public class Entity {
    private String name;
    private int hp = 10;
    private int damage = 1;
    private int level = 1;

    public Entity(String name, int hp, int damage) {
        this.name = name;
        this.hp = hp;
        this.damage = damage;
    }

    public Entity(String name) {
        this.name = name;
    }

    public Entity() {
    }

    public void attack(Entity target) {
        int targetNewHp = target.getHp() - getDamage();

        target.setHp(targetNewHp);

        System.out.println(name + "attacks" + target.getName());
        System.out.println(this + "\n" + target);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " {" +
                "name=" + name + ", hp=" + hp + ", damage=" + damage + ", level=" + level + '}';
    }
}