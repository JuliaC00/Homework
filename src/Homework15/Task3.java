package Homework15;

public class Task3 {
    public static void main(String[] args) {
        Task3 task3=new Task3();
        System.out.println(task3.isPrime(13));
    }
    //Write a method to return whether given number is prime or not?
    /*return type= boolean
    name = isPrime
    parameter=int
    */

    boolean isPrime(int number){

        boolean flag=true;
        if(number>1){
            for(int i=2;i<number;i++){
                if(number%i==0){
                    flag=false;
                    break;
                }}
        }else{
            flag=false;
        }
        return flag;
    }}





