package HW9HW10HW11;

public class PhoneTester {
    public static void main(String[] args) {
        Phone Iphone=new Phone();
        Iphone.call();
        Iphone.color="black";
        Iphone.size=6;
        Iphone.camera=true;
        Iphone.text();

        Phone Pixel=new Phone();
        Pixel.call();
        Pixel.color="grey";
        Pixel.size=5;
        Pixel.camera=true;
        Pixel.text();

        Phone Samsung=new Phone();
        Samsung.call();
        Samsung.color="white";
        Samsung.size=7;
        Samsung.camera=true;
        Samsung.text();
    }
    }


