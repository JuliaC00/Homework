package Homework9hw10hw11;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        //Write a program that reads a range of integers (start and end point),
        // provided by a user and then from that range prints the sum of the even and odd integers


            Scanner scanner=new Scanner(System.in);
            System.out.println("Please enter 2 Numbers starting point and ending point");
            int start= scanner.nextInt();
            int end= scanner.nextInt();

            int evenSum=0;
            int oddSum=0;

            for(int i=start;i<=end; i++) {
                if (i % 2 == 0) {
                    evenSum+=1;
                }else{
                    oddSum=oddSum+i;//also can be written like this oddSum+=i
                }
            }
            System.out.println("Sum of all even numbers "+evenSum);
            System.out.println("Sum of all odd numbers "+oddSum);
        }
    }

