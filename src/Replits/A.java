package Replits;

public class A {
    int i=10;

    public static void main(String[] args) {

        B b=new B(20);

    }
}
class B extends A{
    int i=20;
    B(int i){
        super();
        this.i=i;

    }

    }





/*Create class A

declare variable int i=10;

Create class B  extends A

declare variable int i=20;

        create a method to display value of variable i from both classes

        In Main Class create an object of subclass and call method display

**Expected Output:**

        ```
        20

        10
        ``*/