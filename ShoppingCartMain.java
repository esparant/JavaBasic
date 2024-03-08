package class1.access.ex;

public class ShoppingCartMain {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Item item1 = new Item("고추", 1000, 2);
        Item item2 = new Item("삼겹살", 50000, 2);
        Item item3 = new Item("우유", 50000, -3);
        Item item4 = new Item("응가", -121, 2);
        Item item5 = new Item("아이스", 50000, 2);
        Item item6 = new Item("맘마", 20000, 1);

        cart.addItem(item1);
        cart.addItem(item2);
        cart.addItem(item3);
        cart.addItem(item4);
        cart.addItem(item5);
        cart.displayItem();

        cart.addItem(item6);


        cart.displayItem();

    }
}
