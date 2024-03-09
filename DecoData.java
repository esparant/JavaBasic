package memory.static2;

public class DecoData {

    private int instanceValue;
    private static int staticValue;
    // 클래스소속

    public static void staticCall() {
        // instanceValue++; // 객체변수 끼리 접근불가
        // instanceMethod(); // 객체메소드 끼리 접근불가.

        // 접근 할 수 없는 이유!! 인스턴스 놈들은 객체가 생성되어야 가능한데!
        // 참조값을 모르니까!!
        //애초에 말이 안된다 이말이도다

        // 클래스 소속
        // 같은 클래스 소속, 접근가능.
        staticValue++; // 정적 변수 접근
        staticMethod();
        // 같은 클래스 소속.
    }

    public static void staticCall2(DecoData data) {
        // 즉 static 도 참조값을 알 수 있으면
        // 객체 메소드, 변수에 접근이 가능하도다.
        data.instanceCall();
        data.instanceMethod();
    }

    public void instanceCall() {
        instanceValue++; // 객체변수 접근가능
        instanceMethod(); // 객체메소드 접근가능.
        staticValue++; // 정적 변수 접근
        staticMethod(); // 정적 메소드 접근 가능.
    }

    private void instanceMethod() {
        System.out.println("instanceValue = " + instanceValue);
    }

    private static void staticMethod() {
        System.out.println("staticValue = " + staticValue);
    }
}
