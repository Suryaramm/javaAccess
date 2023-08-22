package com.Oops;

class Animal {
    public void makeSound() {
        System.out.println("Some generic sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Bark! Bark!");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}
class Tiger extends Animal{
    @Override
    public void makeSound() {
        System.out.println("gghhjjjjj!");
    }
}
public class Overriding {
    public static void main(String[] args) {
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();
        
        animal1.makeSound(); 
        animal2.makeSound();
    }
}
