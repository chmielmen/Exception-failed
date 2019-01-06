package programowanie.test;

import java.util.Scanner;

public class Test {

    public int sqr(int hours) {
        if (hours < 0) {
            throw new IllegalArgumentException("Number must be bigger than 0");
        }
        return hours * 60 * 60;
    }

    public static void main(String[] args) {
        Test thing = new Test();
        Scanner scanner = new Scanner(System.in);
        int hours;
        int seconds;

        System.out.println("Type number of hours: ");
        hours = scanner.nextInt();

        try {
            seconds = thing.sqr(hours);
        } catch (IllegalArgumentException exception) {
            System.out.println("You must type positive number, so I just killed your minus :)");
            seconds = thing.sqr(hours * -1);
        }
        System.out.println(seconds + " seconds");
    }
}