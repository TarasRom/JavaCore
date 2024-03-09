package lab3;

public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private char sex;
    private boolean hasAward;
    private static int ID;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        if (age > 18 && age < 70) {
            this.age = age;
        } else {
            System.out.println("Incorrect age");
        }
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public void setHasAward(boolean hasAward) {
        this.hasAward = hasAward;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public char getSex() {
        return sex;
    }

    public boolean isHasAward() {
        return hasAward;
    }

    public Student(String firstName, String lastName, int age, char sex, boolean hasAward) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.sex = sex;
        this.hasAward = hasAward;
    }

    public Student(String firstName, int age) {
        this.firstName = firstName;
        this.age = age;
    }

    public Student() {
        this.firstName = "default";
        this.lastName = "default";
        this.age = -1;
        this.sex = 'q';
        this.hasAward = false;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", hasAward=" + hasAward +
                '}';
    }
}