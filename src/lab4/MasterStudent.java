package lab4;

public class MasterStudent extends Student implements Rating{
    private String internship;

    public MasterStudent(String name, int age, String group, String internship) {
        super(name, age, group);
        this.internship = internship;
    }

    @Override
    public double calculateRating() {
        return 5.0;
    }

    @Override
    public void printInfo() {
        System.out.println("I am master student");
    }
}