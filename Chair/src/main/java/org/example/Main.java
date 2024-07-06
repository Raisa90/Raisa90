package org.example;

class Chair{
    public int leg_Count;
    float area_of_space;
    Chair(int leg, float space) {
        this.leg_Count = leg;
        this.area_of_space = space;
    }

    public void increaseSpace(float increment){
        area_of_space = area_of_space + increment;
    }

    }


public class Main {
    public static void main(String[] args) {

        Chair myChair = new Chair(4,40.56f);
        System.out.println(myChair.leg_Count);
        System.out.println(myChair.area_of_space);
        myChair.increaseSpace(67.45f);
        System.out.println(myChair.area_of_space);

    }
}