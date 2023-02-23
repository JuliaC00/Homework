package Homework9hw10hw11;

public class Homework14 {
        public static void main(String[] args) {

            int[][] matrix = {{10, 23, 30},
                    {51, 22, 47},
                    {13, 22, 45},
            };

            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    if (matrix[i][j]%2==0){
                    System.out.println(matrix[i][j] + " ");
                }

                }

            }
        }}
