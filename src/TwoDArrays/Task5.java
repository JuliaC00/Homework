package TwoDArrays;

public class Task5 {
    public static void main(String[] args) {
       /* Using 2D array create a grocery list.
                Inside you should have an array of veggies, fruits, dairy and sweets.
        Retrieve all values from that array using 2 different loops
*/
        String[][] grocery={
                {"tomato","potato","broccoli"},
                {"banana","mango","apple"},
                {"milk","yogurt","sour cream"},
                {"chocolate","cookie","pie"}
        };

        for(int i=0;i<grocery.length;i++){
            for(int j=0;j<grocery[i].length;j++){
                System.out.println(grocery[i][j]);
            }
        }
        System.out.println("******************");

        for(String []arr:grocery){
            for(String list:arr){
                System.out.println(list);
            }
        }


    }
}
