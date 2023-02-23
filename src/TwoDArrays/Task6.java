package TwoDArrays;

public class Task6 {
    public static void main(String[] args) {

        int[][] array={
                {-5,-2,-3,7},
                {1,-5,-2,2},
                {1,-2,3,-4}
        };

        int sum=0;
        for(int[] arr:array){
            for(int num:arr){
                if(num%2!=0 && num<0){
                    sum++;

                }

            }
            System.out.println(sum);

        }
    }}


