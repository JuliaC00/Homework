package Homework9hw10hw11;
import java.util.Scanner;
public class Homework13 {
    public static void main(String[] args) {
       /* Using Scanner create an array of integer values.
        After the array is created, calculate the sum of all stored elements in that array.package
                */
        Scanner scanner=new Scanner(System.in);
        int[] numbers=new int[5];


        int sum=0;
        for(int i=0;i<numbers.length;i++) {
            numbers[i]=scanner.nextInt();
            sum= sum + numbers[i];
        }
            System.out.println(sum);

        }

    }

