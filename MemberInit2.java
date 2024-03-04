package class1.cunstruct;

public class MemberInit2 {
    String name;
    int age;
    int grade;
    void newMember(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;

        // this 없이하면 그냥 지가 지를 붙여넣는 꼴이 되니까
        // 멤버변수를 가르키는 this 를 사용해서 방지하는 것!
        // 옛날에 안겹쳐도 명확히 구별하기 위해 this 를 사용했지만
        // 요즘은 IDE 가 색으로 구별해주기에 필요없게됨!
        // 오히려 지저분해 보일수도
    }
}
