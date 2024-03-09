package memory.ex;

public class MathArrayUtils {

    private MathArrayUtils() {
    }

    public static int sum(int[] num) {
        int sum = 0;
        for (int i : num) {
            sum += i;
        }
        return sum;
    }

    public static double average(int[] num) {
        return (double) sum(num) / num.length;
    }

    public static int min(int[] num) {
        int value = num[0];
        if (checkLength(num)) {
            return 404;
        }
        for (int i : num) {
            value = (value > i) ? i : value;
        }
        return value;
    }


    public static int max(int[] num) {
        int value = num[0];
        if (checkLength(num)) {
            return 404;
        }
        for (int i : num) {
            value = (value < i) ? i : value;
        }
        return value;
    }

    private static boolean checkLength(int[] Num) {
        if (Num.length == 1) {
            System.out.println("배열 길이가 너무 작습니다.");
            return true;
        }
        return false;
    }
}
