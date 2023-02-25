package Replits;


/*
Create class A

declare variable int i=10;

Create class B  extends A

declare variable int i=20;

        create a method to display value of variable i from both classes

        In Main Class create an object of subclass and call method display
*/


public class A {
    int i=10;
}
class B extends A{
    int i=20;
    B(int i){
        this.i=i;
    }
    void print(){
        System.out.println(i);
    }
    int print1(int i){
        return i;
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