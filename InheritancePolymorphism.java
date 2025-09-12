class Cat {
  int legs = 4;
  String color = "white";

  void makeSound() {
    System.out.println("cat meow");
  }
}

class Tiger extends Cat {
  void makeSound() {
    System.out.println("tiger roar");
  }
}

class Liger extends Tiger {
  int lifeSpan = 10;

  void showLifeSpan() {
    System.out.println("LifeSpan of Liger is:" + lifeSpan);
  }
}

class Tigon extends Liger {
  // int lifeSpan = 12;

  void showLifeSpan() {
    System.out.println("LifeSpan of Tigon is:" + lifeSpan);
    System.out.println("LifeSpan of Liger is:" + super.lifeSpan);
  }
}

class Leopard extends Cat {
  void makeSound() {
    System.out.println("leopard meow");
  }
}

public class InheritancePolymorphism {
  public static void main(String[] args) {
    Cat hitlu = new Cat();
    Tiger myTiger = new Tiger();
    Leopard leu = new Leopard();
    Liger li = new Liger();
    Tigon lig = new Tigon();

    // hitlu.makeSound();i
    // myTiger.makeSound();
    // leu.makeSound();
    // li.showLifeSpan();
    lig.showLifeSpan();
  }
}