interface Vehicle {
    public abstract void move();

    default void horn() {
        System.out.println("Peep Peep! ");
    }
}

interface Machine {
    public abstract void makeSound();

    default void startEngine() {
        System.out.println("Bhututu tu tu..");
    }
}

class Car implements Vehicle, Machine {
    @Override
    public void move() {
        System.out.println("Moves using 4 wheels.");
    }

    @Override
    public void makeSound() {
        System.out.println("Pop Pop..");
    }

}

public class Interface {
    public static void main(String[] args) {
        Car c1 = new Car();

        c1.move();
        c1.makeSound();
    }
}
