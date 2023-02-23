package GroupProject2;

public class Car {
    double carPrice;
    String carColor;
    double calculateSalePrice(double carPrice){
        return carPrice;
    }
}
class Truck extends Car {
    double weight;

    double calculateSalePrice(double carPrice,double weight){
        if (weight > 2000) {
            return carPrice*0.9;
        } else {
            return carPrice*0.8;

        }
    }
}

class Sedan extends Car{
    double lenght;
    double calculateSalePrice(double carPrice,double lenght){
        if (lenght>20){
            return carPrice*0.95;
        }else{
            return 0.9;
        }
    }
}


