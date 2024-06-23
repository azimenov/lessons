package first;

public class Student {
    private String name;
    private String surname;
    private int age;
    private int grade;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                ", school='" + school + '\'' +
                '}';
    }

    private String school;

    public Student(String name, String surname, int age, int grade, String school) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.grade = grade;
        this.school = school;

        Teacher.numberOfStudents++;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public int getGrade() {
        return grade;
    }

    public String getSchool() {
        return school;
    }

    private String toString1() {
        return "Student{" +
                "name='" + name + '\'' +
                ", lastName='" + surname + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                '}';
    }
}
