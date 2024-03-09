package final1;

public class FieldInit {

    static final int CONST_VALE = 10;
    // static final 이 붙으면 대문자 및 언더바로 표기. (관례)
    // 상수라고 한다.
    // 상수란, 변하지 않고 항상 일정한 값을 가지고 있는 수이다.
    // 상수는 기능이 아닌, 고정된 값 자체를 사용하는 것이 목적.
    final int value = 10;

//    public FieldInit(int value) {
//        this.value = value;
//    } // 태어날때부터 값이 정해져 있으면 생성자로도 커버 못함.
}
