package HomeworkArrayList;

 abstract class Insurance {
  // Create 3 objects of the sub classes and store them in ArrayList.
  // Using for loop/advanced for loop/ iterator access all methods of the class.
  String insuranceName;
  public  abstract void getQuote();
  public abstract void cancelInsurance();

 }
class Car extends Insurance{
String carModel;
 public Car(String carModel) {
  this.carModel=carModel;
 }
 @Override
 public void getQuote() {
  System.out.println("car insurance $180");
 }

 @Override
 public void cancelInsurance() {
  System.out.println("Don't cancel car insurance");
 }
}
class Pet extends Insurance{
  String petType;
 Pet(String petType){
  this.petType=petType;
 }

 @Override
 public void getQuote() {
  System.out.println("Pet insurance $100");
 }

 @Override
 public void cancelInsurance() {
  System.out.println("Cancel pet insurance");
 }
}
 class Health extends Insurance{
  int age;
  public Health(int age) {
   this.age=age;
  }
  @Override
  public void getQuote() {
   System.out.println("Health insurance $300");
  }

  @Override
  public void cancelInsurance() {
   System.out.println("You can cancel Health insurance after 1 year");
  }
 }

