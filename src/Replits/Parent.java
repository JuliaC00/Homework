package Replits;

public class Parent {
    int number;
    Parent(){
        System.out.println("Parent Constructor without argument");
    }

    Parent(int number){
        System.out.println(number);
    }}
  class Child extends Parent{
    Child(){
        System.out.println("Child Constructor without argument");}

        Child(int number){
           super(number);
        }
    }




