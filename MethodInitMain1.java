package class1.cunstruct;

import java.lang.reflect.Member;

public class MethodInitMain1 {
    public static void main(String[] args) {
        MemberInit[] members = {
                newMember("user1", 20, 80),
                newMember("user2", 18, 20)
        }; // 이렇게도 되내잉?

        for (MemberInit member : members) {
            System.out.printf("이름: %s, 나이: %d, 점수: %d\n", member.name, member.age, member.grade);
        }
    }

    static MemberInit newMember(String name, int age, int grade) {
        MemberInit newMember = new MemberInit();
        newMember.name = name;
        newMember.age = age;
        newMember.grade = grade;
        return newMember;
    }
}
