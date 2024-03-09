package memory.static1;

public class DataCountMain3 {
    public static void main(String[] args) {

        Data3 data1 = new Data3("A");
        System.out.println("data1.count = " + Data3.count);
        Data3 data2 = new Data3("B");
        System.out.println("data2.count = " + Data3.count);
        Data3 data3 = new Data3("C");
        System.out.println("data3.count = " + Data3.count);
        // 클래스에 직접 접근한다.
        // 객체에 직접 접근해도 되지만,
        // static 이면은 굳이...? 그럴 필요가 없기 때문이오다.

        //인스턴스를 통한 접근
        Data3 data4 = new Data3("D");
        System.out.println("data4.count = " + data4.count);
        // 권장하지 않는 이유
        // 누가보면 count 는 인스턴스 변수인가...? 라고 생각되기 떄문에.
        //

        //클래스를 통한 접근
        System.out.println("data4.count = " + Data3.count);
        // 이야 이거는 무조건 static 클래스 정적 변수네
        //
    }
}
