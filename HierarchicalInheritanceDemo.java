package assignments12;
// Hierarchical Inheritance

class Animalsss {
 void eat() {
     System.out.println("Animal is eating");
 }
}


class Doggg extends Animalsss {
 void bark() {
     System.out.println("Dog is barking");
 }
}


class Cat extends Animalsss {
 void meow() {
     System.out.println("Cat is meowing");
 }
}


public class HierarchicalInheritanceDemo {
 public static void main(String[] args) {

     Dog myDog = new Dog();
     Cat myCat = new Cat();


     myDog.eat();
     myDog.bark();

     myCat.eat();
     myCat.meow();
 }
}
