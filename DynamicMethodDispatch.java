class Employee {
    int salary;
    String field;

    void work() {
        System.out.println("Works in shiftwise manner.");
    }
}

class Banker extends Employee {
    @Override
    void work() {
        System.out.println("Banker works during daytime");
    }

    void getSalary() {
        System.out.println("Bankers have salary more than 20000.");
    }
}

class SecurityGuard extends Employee {
    @Override
    void work() {
        System.out.println("Security guard may have night shift.");
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        Employee b1 = new Banker(); // upcasting(only the class members of parent class are accessible.)
        Employee s1 = new SecurityGuard();// upcasting(aafu vanda thulo class refrence linxa.)
        Banker b2 = (Banker) b1;// downcasting(all methods in child class are accessible.)(thulo level ko reference type bata sano level ma typecasting garne i.e.explicit)
        b2.work();
        s1.work();
        b2.getSalary();

    }

}
