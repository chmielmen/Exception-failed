package programowanie.Test;

import java.util.Scanner;

public class Test {

    public int sqr(int hours, Scanner scanner){
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
            seconds = thing.sqr(hours, scanner);
        }
        catch (IllegalArgumentException exception){
            seconds = thing.sqr(hours * -1, scanner);
        }
        System.out.println(seconds + " seconds");
    }
}