package final1;

public class FinalRefMain {
    public static void main(String[] args) {
        Data data2 = new Data();
        Data data; // 이렇게 하면 주소가 계속 바뀌게 된다.
        data = new Data();
        System.out.println("data = " + data);
        data = new Data();
        System.out.println("data = " + data);
        data = new Data();
        System.out.println("data = " + data);
        data = null;
        data = data2;
        System.out.println("data = " + data);
        System.out.println("data = " + data2);

        final Data data3 = new Data();
        // data2 = new Data(); 하지만 final 로 하면 안된다잉.
        System.out.println(data3.value = 10);
        System.out.println(data3.value = 20);
        // 얘는 참조값만 final 걸었기때문에
        // 필드 값은 변경 가능.
    }
}
