package poly.basic;

public class CastingMain1 {
    public static void main(String[] args) {
        // 부모 변ㅅ가 자식 인스턴스 참조(다항적 참조)
        Parent3 poly = new Child3();
        // 단 자식의 기능은 호출할 수 없다.
        // poly.childMethod();

        // 다운 캐스팅 (부모타입 -> 자식타입)
        Child3 child = (Child3) poly;
        // 타입을 바꿔버린다.
        // 이거는 그냥 개발자가 책임지고 바꾼다는 뜻이다.
        // 프로그램은 일단 말리긴 했음.
        // 부모는 자식의 타입을 담을 수 있지만
        // 자슥은 불가하다 그러니 포맷시켜버린다.
        // 이러한 특정타입으로 바꿔버리는 것을 캐스팅이라고 한다.
        child.childMethod();
        //cast 란 : 금속이나 다른 물질을 녹여 특정한 형태나 모양으로
        // 만드는 과정!

        //일시적 다운캐스팅 - 해당 메서드를 호출하는 순간만 다운캐스팅
        ((Child3) poly).childMethod();
        // 연산자 우선순위에 의해 괄호를 한 번 더 친다.

    }
}
