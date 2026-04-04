package laba2;

// Базовый класс животных
class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void makeSound() {
        System.out.println(name + " издает звук");
    }
}

class Dog extends Animal {
    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println(name + " (" + breed + ") лает: Гав!");
    }
}

class Cat extends Animal {
    private String foodType;

    public Cat(String name, int age, String foodType) {
        super(name, age);
        this.foodType = foodType;
    }

    @Override
    public void makeSound() {
        System.out.println(name + " мяукает: Мяу!");
    }
}

// Базовый класс фигур (переименован)
class Figure {
    protected String color;

    public Figure(String color) {
        this.color = color;
    }

    public double getArea() { return 0; }
    public double getPerimeter() { return 0; }
}

class CircleFig extends Figure {
    private double radius;

    public CircleFig(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}

class SquareFig extends Figure {
    private double side;

    public SquareFig(String color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }
}

public class Task8 {
    public static void main(String[] args) {
        Dog dog = new Dog("Рекс", 3, "Овчарка");
        Cat cat = new Cat("Мурка", 2, "Влажный");

        dog.makeSound();
        cat.makeSound();

        CircleFig circle = new CircleFig("красный", 5);
        SquareFig square = new SquareFig("синий", 4);

        System.out.printf("Круг %s: S=%.2f%n", circle.color, circle.getArea());
        System.out.printf("Квадрат %s: S=%.2f%n", square.color, square.getArea());
    }
}
