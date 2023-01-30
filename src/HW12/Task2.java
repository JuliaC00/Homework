package HW12;

public class Task2 {
    public static void main(String[] args) {
        String str="wednsday";
        for (int i=str.length()-1;i>=0;i--){ //code will always reverse any word
            System.out.println(str.charAt(i));
        }
    }
}
