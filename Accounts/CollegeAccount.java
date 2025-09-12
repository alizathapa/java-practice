package Accounts;

public class CollegeAccount extends Account {
    String collegeName;

    public CollegeAccount(String name, String accNo, String collegeName) {
        super(name, accNo);
        this.collegeName = collegeName;
    }

    public void showCollegeAccount() {
        showDetails();
        System.out.println("College:" + collegeName);
    }

}
