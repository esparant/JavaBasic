package class1.ex;

import java.util.Scanner;

public class ProductEx3 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        ProductOrder[] orders;
        System.out.print("등록하고 싶은 상품 개수를 입력해주세요 : ");
        int value = sc.nextInt();
        orders = new ProductOrder[value];

        sc.nextLine();
        for(int i = 0; i < value; i ++) {
            orders[i] = createOrder(i);
            if (i == value - 1) {
                printOrder(orders);
                sumOrder(orders);
                return;
            }
        }
    }
    static ProductOrder createOrder(int i) {
        ProductOrder order = new ProductOrder();
        System.out.printf("%d번째 상품의 이름을 입력해주세요 : ", i + 1);
        order.productName = sc.nextLine();
        System.out.printf("%d번째 상품의 가격을 입력해주세요 : ", i + 1);
        order.price = sc.nextInt();
        System.out.printf("%d번째 상품의 개수를 입력해주세요 : ", i + 1);
        order.quantity = sc.nextInt();
        sc.nextLine();
        return order;
    }
    static void printOrder(ProductOrder[] orders) {
        for (ProductOrder order : orders) {
            System.out.printf("제품명: %s, 제품가격: %d, 제품개수: %d\n", order.productName, order.price, order.quantity);
        }
    }
    static void sumOrder(ProductOrder[] orders) {
        int sum = 0;
        for (ProductOrder order : orders) {
            sum += order.price * order.quantity;
        }
        System.out.println("총가격: " + sum + "원");
    }
}
