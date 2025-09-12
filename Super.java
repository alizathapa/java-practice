class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void study() {
        System.out.println(name + "is Studying.");
    }

    void showAge() {
        System.out.println("The age of"+"\t" + name + "\t" + "is:" + age);
    }
}

class Boy extends Student {
    Boy(String name, int age) {
        super(name, age);
    }
}

public class Super {
    public static void main(String[] args) {
        Student s = new Student("Chris", 24);
        Boy b1 = new Boy("Alan", 25);
        b1.study();
        b1.showAge();
    }

}
