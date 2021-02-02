package test;

import domain.Monkey;

public class TestAnimal {

    public static void main(String[] args) {
        Monkey monkey = new Monkey("Yerzhan");
        System.out.println(monkey);
        monkey.EatABanana();
        monkey.sleep();
        monkey.eat();
        monkey.speak();
    }
}
