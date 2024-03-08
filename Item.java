package class1.access.ex;

public class Item {
    public Item(String itemName, int itemCost, int itemValue) {
        if (itemCost >= 0 && itemValue > 0) {
            this.itemName = itemName;
            this.itemCost = itemCost;
            this.itemValue = itemValue;
            return;
        }
        System.out.println("물품가격과 개수를 정확히 입력해주세요.");
        System.out.println("해당 상품은 카드에 들어 갈 수 없습니다.");
    }

    private String itemName;
    private int itemCost;
    private int itemValue;

    public String getName() {
        return itemName;
    }

    public int getCost() {
        return itemCost;
    }

    public int getValue() {
        return itemValue;
    }

    public int getTotal() {
        return itemCost * itemValue;
    }
}
