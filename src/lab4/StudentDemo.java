package lab4;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class StudentDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        List<Student> list = new ArrayList<>();
        list.add(new BachelorStudent("Alice", 20, StudyForm.FULL_TIME, "EPAM"));
        list.add(new BachelorStudent("Bob", 18, StudyForm.PART_TIME, "SoftServe"));
        list.add(new MasterStudent("Claire", 19, StudyForm.DUAL, "Google"));
        list.add(new MasterStudent("Dilan", 21, StudyForm.FULL_TIME, "IBM"));

        for (Student element : list) {
            System.out.println(element);
        }

        // Sort students by age and print
        Collections.sort(list);
        System.out.println("After Sorting by age:");
        list.forEach(System.out::println);

        // Accessing All Enum Values:
        for (StudyForm form : StudyForm.values()) {
            System.out.println(form);
        }

    }
}
