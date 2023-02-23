package Homework12;

public class Task3 {
    public static void main(String[] args) {
        /*Write a program that reads two people's first names and if they expecting boy or girl?
        Based on the input suggests a name for a baby:
        Example Output: Mom’s first name? Mary Dad’s first name? Daniel Boy or Girl? boy Suggested
        baby name: DANRY Example Output: Mom’s first name? Mary Dad’s first name? Daniel Boy or Girl? girl
        Suggested baby name: MAIEL
*/
String dadsName="Daniel";
String momsName="Mary";
String expectation="Boy";
String firstHalf="";
String second="";
if(expectation.equalsIgnoreCase("boy")){
     firstHalf=dadsName.substring(0,dadsName.length()/2);//this programs works for any word to pick first half of the word
     second=momsName.substring(momsName.length()/2);
    System.out.println(firstHalf+second);
}else{
    firstHalf=momsName.substring(0,momsName.length()/2);
    second=dadsName.substring(dadsName.length()/2);
}
        System.out.println(firstHalf+second);
    }
}
