package first;

public class Main {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.name = "first";
        teacher.subject = "subject1";

        Teacher teacher1 = new Teacher();
        teacher1.name = "seconds";
        teacher1.subject = "subject2";

        System.out.println(teacher1.name);
        System.out.println(teacher.name);

        Student student = new Student("name", "surname", 1, 2, "name");

        System.out.println(Teacher.numberOfStudents);
    }
}


//
//
//stack                     heap
//int, double,long,         Student(data)
//boolean, character
//int[]
//reference

