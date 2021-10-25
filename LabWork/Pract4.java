package LabWork;

import java.util.Scanner;

public class Pract4 {
    /*
     * Body Mass Index (BMI) is a measure of health on weight. It can be calculated
     * by taking your weight in kilograms and dividing by the square of your height
     * in meters. Write a program that prompts the user to enter a weight in pounds
     * and height in inches and displays the BMI. Note:- 1 pound=.45359237 Kg and 1
     * inch=.0254 meters.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your weight in pound: ");
        double m = sc.nextDouble();
        System.out.println("Enter your height in inch: ");
        double h = sc.nextDouble();
        double BMI = (m * 45359237) / (h * h * 0.0254);
        System.out.println("Your BMI is " + BMI);
        sc.close();
    }
}
