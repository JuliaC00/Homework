package Homework9hw10hw11;

public class Homework17 {
    /*Write a java program to check whether a given number is prime or not?*/
    public static void main(String[] args) {


            int num=31;
            boolean prime=true;
            for (int i = 2; i < num ; i++) {
                if (num%2==0){
                    prime=false;
                    break;
                }

            }

            System.out.println(prime);



        }
    }

