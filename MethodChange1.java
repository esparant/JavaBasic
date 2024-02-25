package class1.ref;

public class MethodChange1 {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        System.out.println("메소드 호출 전 dataA.value = " + dataA.value);
        System.out.println("dataA 참조값 = " + dataA);
        changePrimitive(dataA);
        System.out.println("메소드 호출 후 dataA.value = " + dataA.value);
    }
    public static void changePrimitive(Data dataX) {
        System.out.println("dataX 참조값 = " + dataX);
        dataX.value = 210120391;
    }
}
