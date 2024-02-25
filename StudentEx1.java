package class1.ref;

public class StudentEx1 {
    public static void main(String[] args) {
        Student student1 = new Student();
        // Student 라는 클래스가 두개 있을 경우 옆에 있는 경로를 봐서 고를 것.
        initStudent(student1, "김철수", 20, 18);

        Student student2;
        initStudent(student2 = new Student(), "이유리", 19, 80);

        printStudent(student1);
        printStudent(student2);
    }
// WOW
    static void initStudent(Student student, String name, int age, int grade) {
        student.name = name;
        student.age = age;
        student.grade = grade;
    }

    static void printStudent(Student student) { // 이렇게도 가능함...!!
        System.out.printf("이름: %s, 나이: %d, 성적: %d\n", student.name, student.age, student.grade);
    }
}
