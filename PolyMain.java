package poly.basic;

public class PolyMain {

    public static void main(String[] args) {
        // 부모 변수가 부모 인스턴스 참조
        System.out.println("Parent -> Parent");
        Parent3 parent = new Parent3();
        parent.parentMethod();

        //자식 변수에서 자식 인스턴스 참조
        System.out.println("Child -> Child");
        Child3 child = new Child3();
        child.parentMethod();
        child.childMethod();

        // 부모 변수가 자식 인스턴스 참조(다형적참조) wut?
        System.out.println("Parent -> Child");
        Parent3 poly = new Child3();
        // 자식 인스턴스를 만들었기에 부모, 자식 함수 둘다 생성
        // 부모는 자식을 담으 수 있다.
        // 반대로 자식타입은 부모 타입을 담을 수 없다.
        // 손자도 있으면 담을수있음!! 자기 하위얘들은 전부담을 수있다.
        // ex Parent3 poly2= new GrandSon();
        poly.parentMethod();
        //부모 메소드는 호출할 수있지만, 자식 메소드는 호출 못함.
        // 자기한테 기능이 없으면 부모쪽으로 올라갈수 있찌만
        // 내려가지는 못한다.


    }
}
