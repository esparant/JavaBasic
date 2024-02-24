package class1;

public class ClassStart2 {

    public static void main(String[] args) {
        Student student1 = new Student(); // 배열, 스캔선언이랑 동일한 방식.
        // 선언함으로써 메모리를 확보 이것을 객체, 인스턴스라고한다.
        // 변수선언은 그냥 변순선언일뿐!!
        // new 는 새로 생성한다는 뜻. 클래스 정보를 기반으로 새로운 객체를 생성해라
        // 그러고 나서 students1 은 개체에 접근할 수 있는 참조값을 가지고 있게 된다.
        student1.name = "김철수";
        student1.age = 18;
        student1.grade = 10;

        Student student2 = new Student();
        student2.name = "이유리";
        student2.age = 16;
        student2.grade = 20;

        System.out.println("student1 의 주소 " + student1);
        // student1 가 가지고 있는 참조값 확인
        System.out.printf("이름: %s, 나이: %d, 성적: %d\n", student1.name, student1.age, student1.grade);
        System.out.printf("이름: %s, 나이: %d, 성적: %d", student2.name, student2.age, student2.grade);
// 클래스를 통해 String int 같은 타입같이 사용할 수 있도록 만든 설계도라는 것!
// 설계도인 클래스를 사용해서 실제 메모리에 만들어진 실체를 객채, 또는 인스턴스라고 한다!
        // 클래스를 통해서 사용자가 원하는 종류의 데이터 타입을 마음껏 정의할 수 있음.
    }
}
