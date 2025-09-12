class Cat {
  int legs = 4;
  String color = "white";

  void makeSound() {
    System.out.println("cat meow");
  }

  final void hunt() {
    System.out.println("Silent Killer!");
  }
}

class Tiger extends Cat {

}

class Liger extends Tiger {
  void makeSound() {
    System.out.println("Liger Growl!");
  }
}

public class FinalKeywordInheritance {
  public static void main(String[] args) {
    Cat c = new Cat();
    Tiger t = new Tiger();

    c.makeSound();
    c.hunt();

    t.makeSound();
  }

}