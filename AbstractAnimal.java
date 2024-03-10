package poly.ex2;

public abstract class AbstractAnimal {
    // 추상메서드가 있는 것은 무조건 추상클래스 선언해야함.
    // abstract == 추상
    // new Abstract 같이 직접 인스턴스를 생성하지 못하는
    // 제약을 걸어버림.

    public abstract void sound();
    // abstract 가 붙으면 추상화 시킨다는 뜻
    // 바디를 쓰면 안됨, 무조건 자식 클래스에서 오버라이딩으로 구현할 것.
    // 작동하지 않는 메소드를 가진 불완전한 클래스로 볼 수 있다.
    // 호출도 안된다잉

    public void move() { // 얘는 안해도됨
        System.out.println("동물이 움직입니다.");
    }
    protected void testSound() {
        System.out.println("동물 소리 테스트 시작");
        sound();
        System.out.println("동물 소리 테스트 종료");
    }

}
