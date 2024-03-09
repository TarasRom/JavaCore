package lab4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student student1 = new BachelorStudent("Ivan", 18, "IP", "asd");
        Student student2 = new BachelorStudent("Ivan", 18, "IP", "asd");
        System.out.println(student1 == student2);
        System.out.println(student1.equals(student2));

        List<Student> list = new ArrayList<>();
        list.add(new MasterStudent("Mykola", 21, "IP-23-1m", "IBM"));
        list.add(new MasterStudent("Bob", 25, "IP-23-1m", "Google"));
        list.add(new BachelorStudent("Alice", 25, "IP-22-1", "softserve"));
        list.add(new BachelorStudent("Petro", 19, "IP-22-1", "epam"));
        for (var el : list) {
            el.printInfo();
        }


    }
}