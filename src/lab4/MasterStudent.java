package lab4;

import java.util.Objects;

public class MasterStudent extends Student{
    private String internship;

    public MasterStudent(String name, int age, StudyForm studyForm, String internship) {
        super(name, age, studyForm);
        this.internship = internship;
    }

    @Override
    public int calculateRating() {
        return 5;
    }

    @Override
    public void printInfo() {
        System.out.println("I am master student");
    }

    @Override
    public String toString() {
        return "MasterStudent{" + super.toString() +
                "internship='" + internship + '\'' +
                "} ";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        MasterStudent that = (MasterStudent) o;
        return Objects.equals(internship, that.internship);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), internship);
    }
}
