package domain;

public class Animal {

    protected String name;

    protected int weight;

    protected int height;

    public Animal() {
        name = "generic animal";
        weight = 100;
        height = 150;
    }

    public void eat() {
        System.out.println("Animal eating..."); 
    }

    public void speak() {
        System.out.println("Animal speaking...");
    }

    @Override
    public String toString() {
        return "Animal:" + "\nName:\t" + name + "\nweight:\t" + weight + " kg" + "\nheight:\t" + height + " kg";
    }
}
