public class Parent {

    Parent(){
        System.out.println("This is Parent constructor");
    }}

    class Child extends Parent{
        Child(){
            super();
        }

        public static void main(String[] args) {
                Child child=new Child();
        }



  /*
    Create and object of Child class and run the application.

            **Expected Output:**

            ```
    This is Parent constructor
`*/
}
