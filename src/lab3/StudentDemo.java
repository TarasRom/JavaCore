package lab3;

public class StudentDemo {
    public static void main(String[] args) {
        Student student1 = new Student("Petro", "Petrenkp", 19, 'M', true);
        Student student2 = new Student("Mykola", 20);
        Student student3 = new Student();
        student3.setAge(80);
        System.out.println(student3);

    }
}