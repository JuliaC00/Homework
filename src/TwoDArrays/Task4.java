package TwoDArrays;

public class Task4 {
    public static void main(String[] args) {
       // Create 2D array of cars : american, german, korean, italian.
               // Then retrieve all values from that array using 2 different loops
        String[][] cars={
                {"Tesla","Chevrolet","Ford"},
                {"Audi","BMW","Volkswagen"},
                {"Hyundai","Kia","Genesis"},
                {"Ferrari","Maserati","Lamborghini"}
        };

        for(int i=0;i<cars.length;i++){
            for(int j=0;j<cars[i].length;j++){
                System.out.println(cars[i][j]);

            }
        }
        System.out.println("*****************");

        for(String[]arr:cars){
            for(String car:arr){
                System.out.println(car);
            }
        }
    }
}
