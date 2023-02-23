package Homework20;

public class Shape {
    /*1. Write program: Shape class has a constructor that takes the radius and has a subclass as  circle class.
         In circle class create a method to calculate the area of circle. Test your code
     */

    int rad;
    double area;

    Shape(int rad) {
        this.rad=rad;
    }

    public static class Circle extends Shape{

        Circle(int rad){
            super(rad);
            area= (rad*rad)*Math.PI;
            System.out.println("The area of the circle is: "+area);
        }

    }

    public static void main(String[] args) {
        Circle areas=new Circle(5);

    }
}

