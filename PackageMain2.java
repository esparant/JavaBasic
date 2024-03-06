package pack; // 첫줄은 패키지

import pack.a.User; // 그다음이 임폴트!
import pack.a.*; // 이렇게 하면 그안에 풀더 있는 모든 클래스 사용 가능!
// 패키지 이름은 모두 소문자
// 큰개념부터 작은 개념으로 패키지를 나눔
// ex com.company.myapp 이거는 나중에 외부 라이브러리 쓸때
// 겹치지않도록 관례를 지키고 있음.
// 패키지는 독립적임!! import 를 사용하는 이유!!
// 같은 패키지에 있다고 해도 그대로 사용할 수 있다는 것이 아니로다.
public class PackageMain2 {
    public static void main(String[] args) {
        Data data = new Data();
        User user = new User();
        User2 user2 = new User2();
        pack.b.User user3 = new pack.b.User();
        // 다른패키지에 같은 클래스 이름을 가지고 있는 것을
        // 동시에 사용하고 싶으면 하나는 이렇게 적을 수 밖에 없음.
        // 자주 사용하는 것을 import 나머지는 그냥 다적어라잉
        // 경로를 불러온다.
    }
}
