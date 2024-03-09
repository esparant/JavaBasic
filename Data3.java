package memory.static1;

public class Data3 {
    public String name; // static 이 붙지 않은 것은 인스턴스 변수
    public static int count; // 정적변수, 스태틱변숮, 클래스 변수
    // 얘는 힙 영역에서 관리하지 아니하고, 메서드 영역에서 관리한다.
    // static 이 붙은 변수는 클래스 안에 속해 있기 때문에 클래스 변수.
    // 인스턴스와는 다르게 보통 여러곳에서 공유하는 것을 목적으로 하기에
    // 자바가 시작할때 오직 이거 하나만 실행됨.
    // 변수와 생명주기
    // 지역변수(매게변수포함) < 인시턴스 변수 < 클래스변수
    // 인스턴스 변수는 동적 클래스 변수는 정적!! 멈춰있다!!
    public Data3(String name) {
        this.name = name;
        count++;
        // Data3.count++; 원래 이렇게 해야하지만 생략이 가능하다.
    }



}
