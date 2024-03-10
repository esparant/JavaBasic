package poly.basic.overriding;


public class OverridingMain {
    public static void main(String[] args) {

        // 자식변수가 자식 인스턴스 참조
        Child4 child = new Child4();
        System.out.println("Child -> Child");
        System.out.println("child.value = " + child.value);
        child.method();

        // 부모변수가 보무 인스턴스 참조
        Parent4 parent = new Parent4();
        System.out.println("Parent -> Parent");
        System.out.println("parent.value = " + parent.value);
        parent.method();

        // 부모변수가 자식 인스턴스 참조
        Parent4 poly = new Child4();
        System.out.println("Parent -> Child");
        System.out.println("poly.value = " + poly.value); // 얘는 안되는데
        poly.method(); // 얘가 오버라이딩이 됨 ;;
        // 다형성은 메소드가 오버라이딩 된 게있으면
        // 오버라이딩 된 메소드가 항상!!! 우선권을 갖는다.
        // 손자 타입이 있다면 손자타입이 우선권 !



    }
}
