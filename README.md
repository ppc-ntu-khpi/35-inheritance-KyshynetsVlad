# Практична робота "Реалізація успадкування"

![Done](https://github.com/ppc-ntu-khpi/35-inheritance-KyshynetsVlad/blob/master/Scrins/1.jpg "Done")


# Виконання:

## Умова
<b>Я описав мавпу з іменем Єржан<b>

# Код:

## Animal:
```java
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
``` 
## BananaEater:
```java
package domain;

public class BananaEater extends Animal {

    public void EatABanana() {
        System.out.println("Banana eater is eating bananas...");
    }
}
``` 
## Monkey:
```java
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
``` 
## TestAnimal:
```java
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
``` 
## UML-діаграма

![Done](https://github.com/ppc-ntu-khpi/35-inheritance-KyshynetsVlad/blob/master/images/SchemaPng.png "Done")

## Скріни
![Done](https://github.com/ppc-ntu-khpi/35-inheritance-KyshynetsVlad/blob/master/Scrins/2.png)


## Документація
[Сайт](https://ppc-ntu-khpi.github.io/35-inheritance-KyshynetsVlad)
