package TwoDArrays;

public class Task1 {
    public static void main(String[] args) {
        // Create a 2D array or integer type and store numbers in 3 rows and 3 columns. Print the sum of all numbers.

        int[][] array = {
                {3, 8, 6},
                {4, 9, 2},
                {6, 8, 1}
        };

        int sum = 0;
        for (int[] arr : array)
        for(int i: arr)
            sum+=i;
        System.out.println(sum);

            }

        }

