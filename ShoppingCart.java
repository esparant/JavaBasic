package class1.access.ex;

public class ShoppingCart {
    private final int maxSpace = 10;
    private int itemCount;
    private int space;
    private final Item[] items = new Item[maxSpace];

    public void addItem(Item item) {
        if (checkName(item)) {
            return;
        }
        if (checkSpace()) {
            items[itemCount++] = item; // 이렇게 해도 된다.
            space += item.getValue();
            System.out.println("장바구니에 상품을 넣었습니다.");
            remainSpace();
            return;
        }
        System.out.println("장바구니가 가득 찼습니다. (최대 10개)");
        remainSpace();
    }


    public void displayItem() {
        if (checkCart()) {
            System.out.println("장바구니 내용물 출력");
            for (int i = 0; i < itemCount; i++) {
                System.out.printf("%d. 상품이름: %s, 상품가격: %d, 상품개수 %d\n", i + 1, items[i].getName(), items[i].getCost(), items[i].getValue());
            }
            allCost();
            return;
        }
        System.out.println("아무것도 들어있지 않습니다.");
    }

    public void remainSpace() {
        System.out.println("남은 공간 : " + (maxSpace - space));
    }


    public void allCost() {
        int sum = 0;
        for (int i = 0; i < itemCount; i++) {
            sum += items[i].getTotal();
        }
        System.out.println("총 가격 : " + sum + "원");
    }

    private boolean checkName(Item item) {
        if (item.getName() == null) {
            System.out.println("해당 상품은 장바구니에 넣을 수 없습니다.");
            System.out.println("아이템 가격과 개수를 정확히 입력해주세요.");
            return true;
        }
        return false;
    }

    private boolean checkCart() {
        return itemCount > 0;
    }

    private boolean checkSpace() {
        return space < maxSpace;
    }
}
