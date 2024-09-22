package lab4;

import java.util.Objects;

public abstract class Student implements Rating, Cloneable, Comparable<Student> {
    private String name;
    private int age;
    StudyForm studyForm;

    public Student(String name, int age, StudyForm studyForm) {
        this.name = name;
        this.age = age;
        this.studyForm = studyForm;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract void printInfo();

    public void print() {
        System.out.println("Hello");
    }

    @Override
    public String toString() {
        return  "name='" + name + '\'' +
                ", age=" + age +
                ", studyForm=" + studyForm +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name) && studyForm == student.studyForm;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, studyForm);
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(age, o.age);
    }

    @Override
    public Student clone() {
        try {
            Student clone = (Student) super.clone();
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
