package final1;

public class FinalFieldMain {
    public static void main(String[] args) {
        System.out.println("생성자 초기화");
        ConstructInit constructInit1 = new ConstructInit(10);
        ConstructInit constructInit2 = new ConstructInit(20);
        System.out.println("constructInit1.value = " + constructInit1.value);
        System.out.println("constructInit2.value = " + constructInit2.value);

        System.out.println("필드 초기화");
        FieldInit fieldInit1 = new FieldInit();
        FieldInit fieldInit2 = new FieldInit();
        FieldInit fieldInit3 = new FieldInit();
        System.out.println("fieldInit1 = " + fieldInit1.value);
        System.out.println("fieldInit1 = " + fieldInit2.value);
        System.out.println("fieldInit1 = " + fieldInit3.value);
        // 모든 값이 같은데 굳이 이런식으로 객체를 만드는것은
        // 메모리낭비!

        System.out.println("상수접근");
        System.out.println(FieldInit.CONST_VALE);
        // 그때는 static final 을 이용하는 것이도다
    }
}
