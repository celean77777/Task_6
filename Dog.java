package ru.gb.Lesson_6;

public class Dog extends Animals {
    private static int numOfDogs = 0;

    public static int getNumOfDogs() {
        return numOfDogs;
    }

    public Dog() {
        super();
        numOfDogs++;
    }

    public Dog (String name){
        super(name);
        numOfDogs++;
    }


    @Override
    public void run(int distanceForRun) {
        if (distanceForRun > 500) {
            System.out.println("Я, пёсик " + getName() + ", не могу пробежать" + distanceForRun + "метров");
        } else if (distanceForRun < 0) {
            System.out.println("Пёсики так не бегают...");
        } else {
            System.out.println("Я, пёсик " + getName() + ", бегу " + distanceForRun + " метров");
        }
    }

    @Override
    public void swim(int distanceForSwim) {
        if (distanceForSwim > 10) {
            System.out.println("Я, пёсик " + getName() + ", не могу проплыть" + distanceForSwim + "метров");
        } else if (distanceForSwim < 0) {
            System.out.println("Пёсики так не плавают...");
        } else {
            System.out.println("Я, пёсик " + getName() + ", плыву " + distanceForSwim + " метров");
        }

    }

}
