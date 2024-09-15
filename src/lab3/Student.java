package lab3;

public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private char sex;
    private boolean hasAward;

    public Student() {
        this.firstName = "unknown";
        this.lastName = "unknown";
        this.age = -1;
        this.sex = '-';
        this.hasAward = false;
    }

    public Student(String firstName, int age) {
        this.firstName = firstName;
        this.lastName = "unknown";
        this.age = age;
        this.sex = '-';
        this.hasAward = false;
    }

    public Student(String firstName, String lastName, int age, char sex, boolean hasAward) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.sex = sex;
        this.hasAward = hasAward;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 18 && age < 70) {
            this.age = age;
        } else {
            System.out.println("Incorrect age");
        }
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public boolean isHasAward() {
        return hasAward;
    }

    public void setHasAward(boolean hasAward) {
        this.hasAward = hasAward;
    }

    public void printInfo() {
        System.out.println("Name: " + firstName + ", Last name: " + lastName + ", age: " + age);
    }

    public void printInfoCapital() {
        System.out.println("NAME: " + firstName.toUpperCase() + ", LAST NAME: " + lastName.toUpperCase() + ", AGE: " + age);
    }
}
