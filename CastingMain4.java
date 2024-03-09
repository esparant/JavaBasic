package poly.basic;


public class CastingMain4 {
    public static void main(String[] args) {
        Parent3 parent1 = new Parent3();
        call(parent1);
        System.out.println("----------------");
        Parent3 parent2 = new Child3();
        call(parent2);

    }

    private static void call(Parent3 parent) {
        parent.parentMethod();
        if (parent instanceof Child3 child) {
            // instanceof 를통해 참조하는 타입을 알 수있다.
            // 그냥 이게 왼쪽 있는놈이 오른쪽을 가지고 있느냐
            // 를 말하는 것이도다.
            // 자바 16버전부터는 참이라면 동시에 객체를 생성할 수 있음.
            // 직접 다운캐스팅 하는 과정을 생략할 수 이싸.
            System.out.println("Child 인스턴스 맞음");
            child.childMethod();
            ((Child3) parent).childMethod();
            return;
        }
        System.out.println("Child 인스턴스 아님");
    }
}
