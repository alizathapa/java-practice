abstract class Profession {
    int salary;
    String field;

    abstract void work();

    abstract void learn();

    void getSalary(int salary, char grade) {
        this.salary = salary;

        System.out.println(
                "All Professionals are paid at the end of month amount to :" + salary + "and their grade is:" + grade);
    }
}

class Doctor extends Profession {
    int salary = 40000;
    String field = "Medical";

    @Override
    void work() {
        System.out.println("Doctors work in a medical institution.");

    }

    @Override
    void learn() {
        System.out.println("they learn their practical in the teaching hospitals.");
    }

    @Override
    void getSalary(int salary, char grade) {
        System.out.println("Doctors are paid at the end of month. " + salary + " and their grade is " + grade);
    }
}

public class Abstract {
    public static void main(String[] args) {
        Doctor d = new Doctor();
        d.work();
        d.learn();
        d.getSalary(40000, 'A');
    }
}
