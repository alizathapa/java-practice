
public class Arrays {
    public static void main(String[] args) {
        // SIngle
        String[] fruits = { "Mango", "Apple", "Banana" };

        // Multidimensional (Matrix) ewual num of values in each row
        String[][] students = {
                { "Ram", "Shyam", "Hari" },
                { "Sita", "Gita", "Rita" },
                { "Gopal", "Shyamkumar", "Hariram" },
                { "A", "B", "C" }
        };

        // Jagged
        String[][] teamMembers = {
                { "Ram", "Shyam", "Hari" },
                { "Sita", "Gita" },
                { "Rita" }
        };

        for (int i = 0; i < students.length; i++) {
            for (int j = 0; j < students[i].length; j++) {
                System.out.println("Row: " + i + " Column: " + j + " Value: " + students[i][j]);
            }
        }

        for (int i = 0; i < teamMembers.length; i++) {
            for (int j = 0; j < teamMembers[i].length; j++) {
                System.out.println("Row: " + i + " Column: " + j + " Value: " + teamMembers[i][j]);
            }
        }
    }
}
