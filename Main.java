package ru.gb.Lesson_6;

public class Main {
    public static void main (String[] args){

        Cat cat1 = new Cat("Барсик");
        Cat cat2 = new Cat();
        Dog dog1 = new Dog("Бобик");
        Animals dog2 = new Dog();
        cat1.run(100);
        cat2.run(50);
        dog1.swim(5);
        dog2.swim(3);
        System.out.println(Dog.getNumOfAnimals());
        System.out.println(Dog.getNumOfDogs());
        System.out.println(Cat.getNumOfCats());


    }
}
