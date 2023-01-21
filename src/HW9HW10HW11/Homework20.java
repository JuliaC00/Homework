package HW9HW10HW11;

public class Homework20 {
    /*Write a java program to find the second largest number in the array?*/
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int large = numbers[0];


        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > large) {
                large = numbers[i];
            }
        }

        System.out.println("The largest number is: " + large);


    }}
