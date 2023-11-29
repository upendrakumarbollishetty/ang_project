package assignments12;
// Multilevel Inheritance

class Animalss {
 void eat() {
     System.out.println("Animalss is eating");
 }
}


class Dogg extends Animalss {
 void bark() {
     System.out.println("Dogg is barking");
 }
}


class Bulldog extends Dogg {
 void guard() {
     System.out.println("Bulldog is guarding");
 }
}


public class MultilevelInheritanceDemo {
 public static void main(String[] args) {

     Bulldog myBulldog = new Bulldog();


     myBulldog.eat();
     myBulldog.bark();
     myBulldog.guard();
 }
}
