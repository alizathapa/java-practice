class ElectronicMachine {
    String brand = "Dell";
    final int capacity = 200;

    void showDetails() {
        System.out.println(brand + "has maximum speed of" + capacity);
    }
}

class Computer extends ElectronicMachine {
    final String color = "Black";
    int capacity = 300;

    @Override
    void showDetails() {
        super.showDetails();// here super keyword directly prints statement of parent method
        System.out.println(brand + "computer is much common");
        System.out.println("Capacity of Computer is :" + capacity);
    }
}

class Laptop extends Computer {
    String color = "Silver";

    @Override
    void showDetails() {
        System.out.println(color + "Laptop is much common");
    }
}

public class SuperFinalKeyword {
    public static void main(String[] args) {
        ElectronicMachine e = new ElectronicMachine();
        Computer c = new Computer();
        Laptop l = new Laptop();

        e.showDetails();
        c.showDetails();
        l.showDetails();

    }

}
