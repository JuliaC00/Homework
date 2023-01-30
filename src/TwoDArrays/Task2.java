package TwoDArrays;

public class Task2 {
    public static void main(String[] args) {
       /* Create a 2D array or integer type where you will store odd and even numbers in 3 rows and 4 columns.
            Develop a program which will identify/print the even numbers only.
    }*/

        int[][] array={
                {32,12,13,11},
                {45,32,20,27},
                {41,36,42,10}
        };
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
            if(j%2==0){
                System.out.println(array[i][j]);
            }
                System.out.println();
        }

        }
}}
