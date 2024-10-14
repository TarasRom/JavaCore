package lab7;

import java.time.LocalDate;

public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private Institute institute;

    private static final String UNIVERSITY = "Ivano-Frankivsk National Technical University of Oil and Gas";

    public Student(String firsName, String lastName, int age, Institute institute) {
        this.firstName = firsName;
        this.lastName = lastName;
        this.age = age;
        this.institute = institute;
    }

    // Non-static nested class DegreeWork
    public class DegreeWork {
        private String title;
        private double score;
        private String advisor;

        public DegreeWork(String title, double score, String advisor) {
            this.title = title;
            this.score = score;
            this.advisor = advisor;
        }

        public void printInfo() {
            System.out.println("Degree Work for " + firstName + " " + lastName + ":");
            System.out.println("Degree Title: " + title);
            System.out.println("Score: " + score);
            System.out.println("Advisor: " + advisor);
        }
    }

    // Static nested class StudentConference
    public static class StudentConference {
        private String conferenceName;
        private String location;
        private LocalDate date;

        public StudentConference(String conferenceName, String location, LocalDate date) {
            this.conferenceName = conferenceName;
            this.location = location;
            this.date = date;
        }


        public void printConferenceDetails() {
            System.out.println("Conference Name: " + conferenceName);
            System.out.println("Location: " + location);
            System.out.println("Date: " + date);
            System.out.println("Participant from: " + Student.UNIVERSITY);
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", institute=" + institute +
                ", university=" + UNIVERSITY +
                '}';
    }
}
