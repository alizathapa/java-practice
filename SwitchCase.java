public class SwitchCase {
    public static void main(String[] args) {
        String name = "Sita";
        switch (name) {
            case "Ram":

                System.out.println(" Hello Ram!");
                break;
            case "Sita":
                // age = 30;
                System.out.println("Hello Sita!");
                break;
            default:
                System.out.println("Name not found!");
        }
    }
}
// userPhoneNumber: camel case(user defined functions or methods, variable name
// in Java)
// UserPhoneNumber: Pascal case(Class defined garna in Java)
// user_phone_number: snake case or underscore case(class name,variable
// name,function name in python)