package poly.basic;

public class CastingMain2 {
    public static void main(String[] args) {
        Child3 child = new Child3();
        Parent3 parent = child;
        Parent3 parent2 = (Parent3) child;
        // 다른 타입 들어갈때는 무조건 캐스팅 해줘야한다.
        // 하지만 업캐스팅은 생략가능 오히려 권장함
        parent.parentMethod();
        parent2.parentMethod();


        Child3 child2 = (Child3) new Parent3(); // 얘가문제다
        child2.childMethod(); // 실행불가
        // Parent3 에 child3 의 기능이 들어 있지 않기 떄문!
    }
}
