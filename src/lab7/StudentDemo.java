package lab7;

import java.time.LocalDate;

public class StudentDemo {
    public static void main(String[] args) {

        Student student = new Student("John", "Rembo", 20, Institute.INFORMATION_TECHNOLOGIES);

        Student.DegreeWork degreeWork = student.new DegreeWork("Machine Learning Applications", 90, "Dr. Smith");

        System.out.println(student);
        degreeWork.printInfo();

        Student.StudentConference conference = new Student.StudentConference(
                "International Conference on Computer Science and Information Technologies",
                "Lviv",
                LocalDate.of(2024, 10, 16));

        conference.printConferenceDetails();


        // anonymous inner class
        Rating rating = new Rating() {
            @Override
            public int calculateRating() {
                return 100;
            }
        };
        System.out.println(rating.calculateRating());

    }
}
