package poly.basic;

public class CastingMain3 {
    public static void main(String[] args) {
        // 다운 캐스팅을 자동으로 하지 않는 이유
        Parent3 parent1 = new Child3();
        Child3 child1 = (Child3) parent1;
        child1.childMethod(); // 문제없음

        Parent3 parent2 = new Parent3();
        Child3 child2 = (Child3) parent2; // ClassCastException 런타임오류
        child2.parentMethod(); // 실행불가
        child2.childMethod(); // 실행불가
        // parent2 인스턴스는 Child 클래스를 생성하지 않았다!!
        // Parent 만 생성 했으니까!!!!!!!

        //런타임 오류는 실행중에 터지는 오류이기에
        // 정말 안좋은 오류다.
    }
}
