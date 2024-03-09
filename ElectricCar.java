package extends1.ex2;

public class ElectricCar extends Car{
    // Car : 부모(슈퍼클래스), GasCar : 자식(서브클래스)
    // 이를 상속이라고한다!
    // 자식은 부모의 기능을 사용할 수 있지만,
    // 부모는 자식의 기능을 사용할 수 없다. 애초에 누군지도 모른다잉
    // 자바는 부모가 하나밖에 선택못한다.
    // 부모가 또다른 부모를 가지고 있는건 OK
    // 부모 두개가 move 라는 기능을 가지고 있으면
    // 뭘 골라야 되나 혼란이 생기기떄문.
    // 또한 복잡해질 수도 있기 때문에 금지.
    public void charge() {
        System.out.println("충전합니다.");
    }
}
