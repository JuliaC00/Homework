package Homework20;

 public class Employee {
    /*2. Create an Employee class that will have variables and methods.
    Constructor that should initialize instance variables
Create 2 subclasses FullTime and PartTime Employees that should have own variables and methods.
Create a Tester Subclass from FullTime Employee and add some features and methods to the Tester Class.
Test your code!*/

    String employeeName;
    int employeeNumber;
    String companyName;


    Employee(String employeeName, int employeeNumber, String companyName) {

        this.employeeNumber = employeeNumber;
        this.employeeName = employeeName;
        this.companyName = companyName;
    }

    void company() {
        System.out.println("The employee Name is: " + employeeName + " ,the number of employees is: " + employeeNumber + " the companies name is: " + companyName);
    }
}
    class FullTime extends Employee {

        int hours;


        FullTime(String employeeName, int employeeNumber, String companyName, int hours) {
            super(employeeName, employeeNumber, companyName);
            this.company();
        }

        void full() {
            System.out.println("This is a fulltime job");
        }}

        class PartTime extends Employee {

            int hour;
            String department;

            PartTime(String employeeName, int employeeNumber, String companyName, int hour, String department) {
                super(employeeName, employeeNumber, companyName);
                this.hour = hour;
                this.department = department;
            }

            void printInfo() {
                System.out.println(employeeName + " " + employeeNumber);
            }}







