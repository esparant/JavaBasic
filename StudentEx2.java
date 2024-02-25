package class1.ref;

public class StudentEx2 {
    public static void main(String[] args) {
        Student student1 = new Student();
        // Student 라는 클래스가 두개 있을 경우 옆에 있는 경로를 봐서 고를 것.
        initStudent(student1, "김철수", 20, 18); // 1번째 방법
        System.out.println("student1참조값 = " + student1);
        Student student2;
        initStudent(student2 = new Student(), "이유리", 19, 80);

        Student student3 = createStudent("이녀석", 25, 90); // 2번째방법
        printStudent(student1);
        printStudent(student2);
        printStudent(student3);
    }

    // WOOOOOOOOOOOOOOOOOOOOW
    static Student createStudent(String name, int age, int grade) {
        Student student = new Student();
        System.out.println("student참조값 = " + student);
        student.name = name;
        student.age = age;
        student.grade = grade;
        return student;
    }


    static void initStudent(Student student, String name, int age, int grade) {
        student.name = name;
        student.age = age;
        student.grade = grade;
    }

    static void printStudent(Student student) {
        System.out.printf("이름: %s, 나이: %d, 성적: %d\n", student.name, student.age, student.grade);
    }
}
