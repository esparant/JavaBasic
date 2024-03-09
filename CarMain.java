package extends1.ex2;

public class CarMain {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        // 생성하면 부모, 자식 클래스의 객체가 동시에 생성!!
        electricCar.charge();
        // 호출하는 변수의타입(클래스)를 기준으로 선택한다!!
        // 즉 ElectricCar 에 들어있는 charge 를 선택!
        electricCar.move();
        // 먼저 ElectricCar 에 클래스를 접근!!
        // 해당 기능이 없으면 부모타입으로 오라가서 찾는다!
        // 만약 부모에도 이런 기능이없다! 그럼 부모의 위를 올라가서 찾는다.
        // 없으면 컴파일 오류


        GasCar gasCar = new GasCar();
        gasCar.move();
        gasCar.fillUp();
    }
}
