package Homework9hw10hw11;
import java.util.Scanner;
public class Homework12 {
    public static void main(String[] args) {

       /* Create an array of countries.
       While retrieving all values from an array print capital for each country choose any five countries.!!
```*/
        Scanner scanner=new Scanner(System.in);
        String[] countries={"Belgium","France","China","Canada"};
        for(int i=0;i<countries.length;i++){
            System.out.println("Please enter the capital of "+countries[0]+": ");
            String capital=scanner.next();
            System.out.println("Please enter the capital of "+countries[1]+": ");
            String capital2=scanner.next();
            System.out.println("Please enter the capital of "+countries[2]+": ");
            String capital3=scanner.next();
            System.out.println("Please enter the capital of "+countries[3]+": ");
            String capital4=scanner.next();
        }



    }

}
