public class Method{

    static void sum2D(int array[][]){

        int sum = 0;
        for (int[] arr : array)
            for(int i: arr)
                sum+=i;

        System.out.println(sum);
    }}

 class ArrayTester extends Method{
     public static void main(String[] args) {
         int[][] a = {

                 { 1, 2, 3 },

                 { 4, 5, 6 },

                 { 7, 8, 9 }

         };
         sum2D(a);

     }
    }



   /*
    /*
    int[][] a = {

            { 1, 2, 3 },

            { 4, 5, 6 },

            { 7, 8, 9 }

    };

    and execute sum2D method

**Expected Output:**

            ```
            45
*/
