package GroupProject2;

public class CarTester {
    public static void main(String[] args) {
        Truck truck=new Truck();
        System.out.println("The price of the truck is "+truck.calculateSalePrice(60000,1500));



        Sedan sedan=new Sedan();
        System.out.println("The price of Sedan is "+ sedan.calculateSalePrice(35000,60));

    }
}

