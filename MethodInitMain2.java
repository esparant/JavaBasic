package class1.cunstruct;

public class MethodInitMain2 {
    public static void main(String[] args) {
        MemberInit2 member1 = new MemberInit2();
        member1.newMember("user1", 10, 20);
        MemberInit2 member2 = new MemberInit2();
        member2.newMember("user2", 20, 30);
        MemberInit2[] members = {member1, member2};

        for (MemberInit2 member : members) {
            System.out.printf("이름: %s, 나이: %d, 점수: %d\n", member.name, member.age, member.grade);
        }
    }
}
