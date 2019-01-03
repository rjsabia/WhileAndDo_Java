package com.company;

public class Main {

    public static void main(String[] args) {

        int count = 1;

        while(count != 6) {
            System.out.println("Count value is " + count);
            count++;
        }

        System.out.println("****************");

        //another way
        int count2 = 1;

        while(true) {
            if(count2 == 6) {
                break;
            }
            System.out.println("Count value is " + count2);
            count2++;
        }

        System.out.println("*****************");
        //the DO while loop

        int count3 = 1;
        do {
            System.out.println("Count value was " + count3);
            count3++;
        } while(count3 != 6);

        System.out.println("********************");

        int number = 4;
        int finishNumber = 20;

        while(number <= finishNumber) {
            number++;
            if(!isEvenNumber(number)) {
                continue;
            }

            System.out.println("Even number " + number);
        }

    }

    public static boolean isEvenNumber(int num) {

        if((num % 2) == 0) {
            //System.out.println("Even");
            return true;
        }
        //System.out.println("Odd");
        return false;
    }
}
