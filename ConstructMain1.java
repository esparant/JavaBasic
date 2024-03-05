package class1.cunstruct;


public class ConstructMain1 {
    public static void main(String[] args) {
        MemberConstruct user1 = new MemberConstruct("user1", 1, 3);
        // 괄호안에 아무것도 없이 생성못함!
        MemberConstruct user2 = new MemberConstruct("user2", 5, 6);
        MemberConstruct user3 = new MemberConstruct("user3", 3);
        MemberConstruct[] users = {user1, user2, user3};
        for (MemberConstruct user : users) {
            System.out.printf("이름: %s, 나이: %d, 성적: %d\n", user.name, user.age, user.grade);
        }

    }
}
