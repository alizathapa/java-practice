class Vehicle {
    final int speed = 200;

    void showSpeed() {
        System.out.println("Speed is :" + speed);
    }
}

class Car extends Vehicle {
    int speed = 300; // here 

    @Override
    void showSpeed() {
        System.out.println("Speed of car is:" + speed);
    }
}
 
public class Example {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        Car c = new Car();

        v.showSpeed();
        c.showSpeed();
    }

}
