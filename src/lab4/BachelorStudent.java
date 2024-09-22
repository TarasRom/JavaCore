package lab4;

import java.util.Objects;

public class BachelorStudent extends Student{
    private String practice;

    public BachelorStudent(String name, int age, StudyForm studyForm, String practice) {
        super(name, age, studyForm);
        this.practice = practice;
    }

    @Override
    public int calculateRating() {
        return 100;
    }

    @Override
    public void printInfo() {
        System.out.println("I am bachelor student");
    }

    @Override
    public String toString() {
        return "BachelorStudent{" + super.toString() +
                "practice='" + practice + '\'' +
                "} ";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        BachelorStudent that = (BachelorStudent) o;
        return Objects.equals(practice, that.practice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), practice);
    }
}
