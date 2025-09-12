class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void study() {
        System.out.println(name + " is studying.");
    }
}

public class Constructor {
    public static void main(String[] args) {
        Student s1 = new Student("Aliza", 20);

        s1.study();
    }
}
