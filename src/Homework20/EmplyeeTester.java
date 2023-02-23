package Homework20;

 class EmployeeTester {
    public static void main(String[] args) {
        FullTime full=new FullTime("John",101,"Galpin",40);
        full.full();

        PartTime part=new PartTime("Veronica",102,"Creative",25,"accounting");
        part.printInfo();
    }
}
