package class1.cunstruct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    MemberConstruct(String name, int age, int grade) {
        // 더 객체를 편하게 생성하기 위해 생성자를 도입!!
        System.out.printf("생성자 생성, 이름 : %s ,나이 : %d, 성적 : %d\n", name, age, grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    MemberConstruct(String name, int age) {
        this(name, age, 50);
        // 기존 생성자하고 겹치면 이렇게 생략할 수 있따.
        // 생성자 내부에서 자신의 생성자를 호출할 수 있음!
        // 안넣으면 0점 처리 되니까 혹시 모르니 넣어준다 ㅎㅎ
        // 무조건 생성자 내부 첫줄에 작성할것!! 안그럼 오류남.
        System.out.printf("생성자 생성, 이름 : %s ,나이 : %d\n", name, age);
    }

    // 오버로딩!!


}
