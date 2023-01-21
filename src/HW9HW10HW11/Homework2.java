package HW9HW10HW11;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
//Create a program that will be asking user to apply for a credit card 10 times.
// As soon you get an “yes” from a user program should stop asking.

            Scanner scanner=new Scanner(System.in);
            for (int i = 1; i <= 10; i++) {
                System.out.println("Apply for a credit card");
                String userResponse=scanner.next();
                if(userResponse.equalsIgnoreCase("yes")) {
                    break;

                }
            }
        }
    }