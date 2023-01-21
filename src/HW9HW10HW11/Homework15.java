package HW9HW10HW11;

public class Homework15 {
    public static void main(String[] args) {
        /*Create a 2D array of integers.
                Develop a program which will calculate the sum of  even and odd numbers for that array.
    }*/

        int[][] arr={ {114,220,31},
                {67,28,115},
                {17,23,86,54},
        };


        int evenSum=0;
        int oddSum=0;
        for(int i=0; i<arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j]%2==0){
                evenSum+=arr[i][j];
                }else if(arr[i][j]%2!=0){
                    oddSum+=arr[i][j];
                }
            }
        }
        System.out.println("Sum of even numbers "+evenSum);
        System.out.println("Sum of odd numbers "+oddSum);

}}
