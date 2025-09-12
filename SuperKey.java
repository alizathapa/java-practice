class Person{
    String name;
    int age;
    String address;

    Person(String name, int age,String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }

        public void details(){
            System.out.println("Name:"+name);
            System.out.println("Age:"+age);
            //System.out.println("Address:"+address);
        }  
    }
    class Student extends Person{
        int rollNo;
        // void Student(int rollNo,String address){
        //     this.rollNo = rollNo;
        // }

         public void showDetails(){
            System.out.println("rollNo"+rollNo);
            System.out.println("Address:"+super.address);
        }
    }
 public class SuperKey {
    Person p1 = new Person("Alice",23,"KTM");
Student s1 = new Student();
 }