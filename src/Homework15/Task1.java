package Homework15;

public class Task1 {

    void isPalindrome(String str){
        StringBuilder st=new StringBuilder(str);
        st.reverse();
        String reversed=st.toString();
        if(str.equals(reversed)){
            System.out.println(str+" is palindrome");
        }else{
            System.out.println(str+" is not palindrome");
        }
    }
    public static void main(String[] args) {
       //Create a method that will print whether given String is palindrome or not.
        /*return type=void
        name=isPalindrome
        parameters=String inputStr   */
        Task1 task1=new Task1();
        task1.isPalindrome("Kaya");//String result+ task1.isPalindrome("Kaya");=can't assign void methods to variables
        //System.out.println(task1.isPalindrome("Kaya"));can't use void methods in Println

}}
