abstract class Plant {
    String name;
    double lifeSpan;

    abstract void grow();

    abstract void pollinate();

     void prepareFood() {
        System.out.println("Plant prepares food by performing Photosynthesis.");
    }
}

class RicePlant extends Plant {
    String name = "Dhaan";
    double lifeSpan = 0.6;

    @Override
    void grow() {
        System.out.println("Rice Plant grows upto maximum 100 cm.");
    }

    @Override
    void pollinate() {
        System.out.println("Rice Plant pollinates through insects.");
    }

    void prepareFood() {
        super.prepareFood();
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        RicePlant r = new RicePlant();
        r.grow();
        r.pollinate();
        r.prepareFood();
    }
}
