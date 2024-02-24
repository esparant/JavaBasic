package class1;

public class ClassStart4 {

    public static void main(String[] args) {
        Student student1 = new Student(); // 배열, 스캔선언이랑 동일한 방식.
        student1.name = "김철수";
        student1.age = 18;
        student1.grade = 10;

        Student student2 = new Student();
        student2.name = "이유리";
        student2.age = 16;
        student2.grade = 20;

        Student student3 = new Student();

        Student[] students = {student1, student2, student3}; // 이렇게 해도 된다잉.

        System.out.println("student1 의 주소 : " + student1);
        System.out.println("student[0] 의 주소 :" + students[0]);
        for(int i = 0; i < students.length; i ++) {
            System.out.printf("이름: %s, 나이: %d, 성적: %d\n", students[i].name, students[i].age, students[i].grade);
        }

        for(int i = 0; i < students.length; i ++) {
            Student s = students[i]; // 이렇게 하면 더 보기 쉽다!
            System.out.printf("이름: %s, 나이: %d, 성적: %d\n", s.name, s.age, s.grade);
        }

        for (Student s : students) { // 이렇게 해도 된다!
            System.out.printf("이름: %s, 나이: %d, 성적: %d\n", s.name, s.age, s.grade);
        } // iter <- 기억하자
    }
}
