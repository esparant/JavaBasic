package memory.ex;

import static memory.ex.MathArrayUtils.*;

public class MathArrayUtilsMain {
    public static void main(String[] args) {
        int[] values = {1, 2, -1, -5, 7, 99, -999};

//        MathArrayUtils math1 = new MathArrayUtils();

        System.out.println("sum : " + sum(values));
        System.out.println("average : " + String.format("%.2f",average(values)));
        System.out.println("min : " + min(values));
        System.out.println("max : " + max(values));
    }
}
