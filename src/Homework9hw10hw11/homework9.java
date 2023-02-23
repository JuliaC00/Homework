package Homework9hw10hw11;

public class homework9 {
    public static void main(String[] args) {
        /*Create an array that can store names of cars and store 6 elements into it. Print all values from the array.*/
        String[] cars=new String[6];
        cars[0]="Toyota";
        cars[1]="Jeep";
        cars[2]="Mercedes";
        cars[3]="Chevrolet";
        cars[4]="Honda";
        for (int i=0;i<cars.length;i++){
            System.out.println(cars[i]);
    }
}}
