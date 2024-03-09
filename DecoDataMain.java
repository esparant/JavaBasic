package memory.static2;


import static memory.static2.DecoData.*; // 전부 쓰고싶으면
// or import static memory.static2.DecoData.staticCall;
// 만약 이걸 자주 쓰는 상황이 있으면 import 를 활용하자
// static 이 붙어야함!!


public class DecoDataMain {
    public static void main(String[] args) {
        // 인스턴스 없이 실행하는 메소드가 바로 main 메소드
        // 작동하는 이유 - 객체를 생성하지 않아도 되니까!!
        // static 이니까!!
        // 지금까지 클래스 안에 메소드를 생성해서
        // main 메소드에 호출하기 위해서 static 을 붙인 이유가
        // 같은 static 끼리 호출 할 수 있으니까!
        System.out.println("1. 정적호출");
        DecoData.staticCall();

        System.out.println("2. 인스턴스호출1");
        DecoData data1 = new DecoData();
        data1.instanceCall();

        System.out.println("3. 인스턴스호출2");
        DecoData data2 = new DecoData();
        data2.instanceCall();

        System.out.println("4. 정적호출2");

        staticCall2(data1);
        staticCall2(data2);

        System.out.println("테스트");
        data2.staticCall(); // 인텔리제이가 추천하지 않기에
        // 컨트롤 엔터해도 나오지 않는다.
        System.out.println("테스트2");
        staticCall(); //

    }
}
