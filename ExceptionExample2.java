class VotingCandidate {
    String name;
    int age;
    String nationality;

    void checkNationality(String name, String nationality) throws Exception {
        this.name = name;
        this.nationality = nationality;
        if (this.nationality.equals("Nepalese")) {
            System.out.println("The person belongs to the nation.");
        } else {
            throw new Exception("The person does not belong to the nation!");
        }
    }

    void checkEligibility(int age) throws Exception {
        this.age = age;
        if (this.age < 18) {
            throw new Exception("The person is minor!");
        } else {
            System.out.println("The person is eligible for Voting.");

        }
    }
}

public class ExceptionExample2 {
    public static void main(String[] args) {
        VotingCandidate v1 = new VotingCandidate();
        try {
            v1.checkNationality("Aliza", "Indian");
            v1.checkEligibility(21);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
