package lab11;
@CrazyStudent(value = "BAD Student", rating = 35)
public class Student {

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

    @AnnoMethod
    @Deprecated
    public void printInfo() {
        System.out.println("Hello");
    }
}
