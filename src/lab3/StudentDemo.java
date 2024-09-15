package lab3;

import java.util.List;

public class StudentDemo {
    public static void main(String[] args) {
        Student student1 = new Student("Petro", "Petrenko", 25, 'M', false);
        Student student2 = new Student("Alf", 285);
        Student student3 = new Student();

        List<Student> list = List.of(student1, student2, student3);
        for (Student el : list) {
            el.printInfo();
        }
    }
}
