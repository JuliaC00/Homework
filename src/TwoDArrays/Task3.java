package TwoDArrays;

public class Task3 {
    public static void main(String[] args) {
        /*Create 2D array of countries: north america countries, south america countries, europe countries, asian countries, african countries.
                Then print all values from that array using 2 different loops and calculate how many total countries been stored*/

        String[][] countries = {
                {"Canada", "USA", "Mexico"},
                {"France", "Germany", "Italy"},
                {"China", "Indonesia", "Vietnam"},
                {"Tanzania", "Egypt", "Nigeria"}
        };

        for (int i = 0; i < countries.length; i++) {
            for (int j = 0; j < countries[i].length; j++) {
                System.out.println(countries[i][j]);
            }
        }
        System.out.println("**********************");


        for (String[] arr : countries) {
            for (String country : arr) {
                System.out.println(country);
            }
        }
    }}


