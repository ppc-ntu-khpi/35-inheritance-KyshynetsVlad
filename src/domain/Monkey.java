package domain;

public class Monkey extends BananaEater {

    private String kind;

    public Monkey(String name, int weight, int height, String kind) {
        this.name = name;
        this.weight = weight;
        this.height = height;
        this.kind = kind;
    }

    public Monkey() {
        this("Humanoid", 50, 120, "Primate");
    }

    public Monkey(String name) {
        this(name, 50, 120, "Primate");
    }
    
    

    public void sleep() {
        System.out.println("Primate is sleeping...");
    }

    @Override
    public void EatABanana() {
        System.out.println("Primate is eating a banana...");
    }

    @Override
    public String toString() {
        return super.toString()+"\nkind:\t"+this.kind+"\n\nThis is a monkey";
    }

    @Override
    public void speak() {
        System.out.println("Primate speaking sign language...");
    }

    @Override
    public void eat() {
        System.out.println("Primate eats lasagna...");
    }
    
    
}
