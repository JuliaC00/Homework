package HW9HW10HW11;

public class Homework10 {
    public static void main(String[] args) {
        /*Create an array of size 5 on integers and calculate the sum of all elements in an array.*/
        int[] numbers={5,9,12,8,42};

        int sum=0;
        for(int i=0;i<numbers.length;i++) {
            System.out.println(numbers[i]);

            sum += sum + numbers[i];
        }
        System.out.println(sum);
    }
}
