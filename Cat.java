package ru.gb.Lesson_6;

public class Cat extends Animals {

    private static int numOfCats = 0;

    public static int getNumOfCats() {
        return numOfCats;
    }

    public Cat() {
        super();
        numOfCats++;
    }

    public Cat(String name){
        super(name);
        numOfCats++;
    }


    @Override
    public void run(int distanceForRun) {
        if (distanceForRun>200) {
            System.out.println("Я, котик " + getName() + ", не могу пробежать" + distanceForRun + "метров");
        } else if (distanceForRun<0) {
            System.out.println("Котики так не бегают...");
        } else {
            System.out.println("Я, котик " + getName() + ", бегу " + distanceForRun + " метров");
        }
    }

    @Override
    public void swim(int distanceForSwim) {
        System.out.println("Я, котик " + getName() + ", не могу проплыть" + distanceForSwim + "метров. Я вообще не плаваю");
    }
}
