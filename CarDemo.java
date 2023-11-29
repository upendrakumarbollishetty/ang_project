package assignments12;

class Car {

 String make;
 String model;
 int year;


 public Car(String make, String model, int year) {
     this.make = make;
     this.model = model;
     this.year = year;
 }


 public void displayInfo() {
     System.out.println("Make: " + make);
     System.out.println("Model: " + model);
     System.out.println("Year: " + year);
 }
}


public class CarDemo {
 public static void main(String[] args) {

     Car myCar = new Car("Toyota", "Camry", 2022);


     myCar.displayInfo();


     Car anotherCar = new Car("Honda", "Accord", 2023);


     anotherCar.displayInfo();
 }
}


