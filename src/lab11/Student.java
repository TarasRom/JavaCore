package lab11;

@CrazyStudent(value = "Bad student", rating = 35, institute = Institute.INFORMATION_TECHNOLOGIES)
public class Student{
    private String name;
    private int age;
    @SuppressWarnings("unused")
    private String group;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", group='" + group + '\'' +
                '}';
    }

    @Deprecated
    @AnnoMethod
    public void printInfo() {
        System.out.println("Hello");
    }
}
