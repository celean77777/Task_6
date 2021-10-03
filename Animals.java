package ru.gb.Lesson_6;

public class Animals {
    private static int numOfAnimals = 0;
    private String name;

    public String getName() {
        return name;
    }

    public Animals(){
        this.name = "NoName";
        numOfAnimals++;
    }

    public Animals(String name){
        this.name=name;
        numOfAnimals++;
    }

    public static int getNumOfAnimals() {
        return numOfAnimals;
    }

    public void run(int distanceForRun){
        System.out.println(this.name + " пробежал " + distanceForRun + " метров");
    }

    public void swim(int distanceForSwim){
        System.out.println(this.name + " проплыл " + distanceForSwim + " метров");
    }


}
