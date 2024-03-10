package poly.ex;

public class Animal {

    protected void sound() {
        System.out.println("동물 울음 소리");
    }
    void testSound() {
        System.out.println("동물 소리 테스트 시작");
        sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
