package test;

public class Task2 {
    public static void main(String[] args) {
        int number = 345;
        System.out.print("Число " + number + " -> ");

        int hundreds = number / 100;
        int tens = (number % 100) / 10;
        int units = number % 10;

        System.out.println(hundreds + ", " + tens + ", " + units);
    }
}