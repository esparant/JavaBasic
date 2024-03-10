package poly.car1;

public class Driver {
    private Car car;

    public void setCar(Car car) {
        System.out.println("자동차를 설정합니다 : " + car.getCarName());
        this.car = car;
    }
    // OCP 원칙
    // open for extension : 새로운 기능의 추가나 변경 사항이 생겼을 때
    // 기존 코드는 확장할 수 있어야 한다.
    // Closed for Modification : 기존의 코드는 수정되지 않아야 한다.
    // NewCar을 추가해도 코드는 전혀 변경하지 않았다.
    // 일부 제외하고!
    // 확장에 열려있다는 것은 Car 인터페이스를 사용해 새로운 차량을 자유롭게
    // 추가할 수 있다.
    // 코드 수정은 닫혀있다는 것은 어딘가의 코드는 수정해야 한다.
    // 변하지 않는 부분 Driver 클래스
    // 변하는 부분 main() 을 포함한 NewCar 의 일부
    // OCP를 지켜도 반드시 수정해야하는 부분은 있도다
    // 정리 : Car 을 사용하는 클라이언트 코드인 Driver 코드의 변경업이
    // 새로운 자동차를 확장가능, 다향성을 활용하여
    // 역할관 구현을 잘 분리하면 새로운 자동차를 추가해도 대부분의 핵심
    // 코드들을 그대로 유지할 수 있게 됨.
    // 전략 패턴이란
    // 알고리즘을 클라이언트 코드의 변경 없이 쉽게 교체할 수 있는 것.
    // Car 인터페이스가 전략을 정의하는 인터페이스가 되고, 각각의 차량이
    // 전략의 구체적인 구현이 된다.
    // 그리고 전력을 클라이언트 코드(Driver)의 변경없이 손쉽게 교체할 수 있음.
    public void drive() {
        System.out.println("운전을 시작합니다.");
        car.startEngine();
        car.pressAccelerator();
        car.offEngine();
        System.out.println("운전을 종료합니다.");

    }
}
