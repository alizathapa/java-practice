class Motorcycle {
    String brand = "Yamaha";
    int speed = 80;
    static String color = "Red";

    // dependent inner class(non-static inner class)
    class Engine {
        int horsepower = 180;

        void showEngineDetails() {
            System.out.println("Motorcycle brand:" + brand);
        }
    }

    // independent inner class(static inner class)
    static class Helmet {
        void showColorDetails() {
            System.out.println("Color of Helmet:" + color);
            System.out.println("This the best color.");
        }
    }
}

public class Nested {
    public static void main(String[] args) {
        Motorcycle m1 = new Motorcycle();
        // creating object for non-static inner class
        Motorcycle.Engine e1 = new Motorcycle().new Engine();
        e1.showEngineDetails();

        Motorcycle.Helmet c1 = new Motorcycle.Helmet();
        c1.showColorDetails();
    }
}
