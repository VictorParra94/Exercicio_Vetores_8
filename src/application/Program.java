package application;

import entities.Person;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("How many people will be entered? = ");
        int length = sc.nextInt();
        Person[] person = new Person[length];

        double lowerHeight = 999;
        double higherHeight = 0;
        double womanAverageHeight = 0;

        for (int i = 0; i < length; i++) {
            System.out.print((i + 1) + "st person height = ");
            double height = sc.nextDouble();
            System.out.print((i + 1) + "st person gender F/M = ");
            sc.next();
            String gender = sc.nextLine();
            person[i] = new Person(height, gender);

            if (person[i].getHeight() < lowerHeight) {
                lowerHeight = person[i].getHeight();
            }
            if (person[i].getHeight() > higherHeight) {
                higherHeight = person[i].getHeight();
            }
            if (person[i].getGender().equals("F")){
                womanAverageHeight += person[i].getHeight();
            }
        }
        System.out.println("Lower height = " + lowerHeight);
        System.out.println("Higher height = " + higherHeight);
        System.out.println("Woman average height = " + womanAverageHeight);
    }
}
