package lab4;

import java.util.Objects;

public class BachelorStudent extends Student implements Rating,Comparable<Student>{
    private String practice;

    public BachelorStudent(String name, int age, String group, String practice) {
        super(name, age, group);
        this.practice = practice;
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(getAge(), o.getAge());
    }



    @Override
    public void printInfo() {
        System.out.println("I am bachelor student");
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

    @Override
    public double calculateRating() {
        return 100.0;
    }

}