package Replits;

public class Constant {
    static final double avgElements(int[] array) {
        int sum = 0;
        for(int i=0; i < array.length ; i++)
            sum = sum + array[i];
        //calculate average value
        double average = sum / array.length;
        return  average;
    }

    public static void main(String[] args) {
        int[] a = {2,7,3,8,4};
        System.out.println(avgElements(a)); //should print 4.8

    }
}




