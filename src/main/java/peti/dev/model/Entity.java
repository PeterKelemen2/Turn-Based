package peti.dev.model;

public class Entity {
    private String name;
    private double hp = 10;
    private double maxHp = 10;
    private double damage = 1;
    private int level = 1;

    public Entity(String name, double hp, double damage) {
        this.name = name;
        this.hp = hp;
        this.maxHp = hp;
        this.damage = damage;
    }

    public Entity(String name) {
        this.name = name;
    }

    public Entity() {
    }

    public void attack(Entity target) {
        double targetNewHp = target.getHp() - getDamage();

        target.setHp(targetNewHp);

        System.out.println(name + " attacks " + target.getName());
        System.out.println(this + "\n" + target);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHp() {
        return hp;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }

    public double getMaxHp() {
        return maxHp;
    }

    public void setMaxHp(double maxHp) {
        this.maxHp = maxHp;
    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void levelUp() {
        setLevel(this.level + 1);
        this.damage *= 1.1;
        this.maxHp *= 1.1;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " {" +
                "name=" + name + ", hp=" + maxHp + "/" + hp + ", damage=" + damage + ", level=" + level + '}';
    }
}