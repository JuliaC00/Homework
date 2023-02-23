package Homework16;

public class Task2 {
    public String reverseStr(String input){
        return new StringBuilder(input).reverse().toString();
    }

    public static void main(String[] args) {
        Task2 task2=new Task2();
        task2.reverseStr("Monday");
    }
}
