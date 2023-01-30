package Homework15;

public class Task2 {
    public static void main(String[] args) {
        Task2 task2=new Task2();
        System.out.println(task2.sayHello("Italy"));
    }


        // Create a method that will say Hello in different language based on the country
    // that will passed when method is executed
        //return type=String void
        //name=sayHello
        //parameter=String countryName

        String sayHello(String countryName){
    switch (countryName){

        case"USA":
            return "Hello";//break is not needed when we use the return keyword
        case "Kazakhstan":
            return "Salem";
        case "Italy":
            return"Ciao";
        case "China":
            return"Ni hao";
        default:
            return "country is not supported";
    }
    }
}


