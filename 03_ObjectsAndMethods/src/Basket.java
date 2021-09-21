public class Basket {

    private static int allBasketPrice = 0;
    private static int allBasketItems = 0;
    private static int allBasketCount = 0;
    private String items = "";
    private int totalItemsCount = 0;
    private double totalWeight = 0;
    private int totalPrice = 0;
    private int limit;

    public Basket() {
        increaseAllBasketCount(1);
        items = "Список товаров:";
        this.limit = 1000000;
    }

    public Basket(int limit) {
        this();
        this.limit = limit;
    }

    public Basket(String items, int totalPrice) {
        this();
        this.items = this.items + items;
        this.totalPrice = totalPrice;
    }

    public static int avgPriceItems(){
        return allBasketPrice/allBasketItems;
    }

    public static int avgPriceBasket(){
        return allBasketPrice/allBasketCount;
    }


    public static int getAllBasketPrice() {
        return allBasketPrice;
    }

    public static int getAllBasketItems() {
        return allBasketItems;
    }

    public static int getAllBasketCount() {
        return allBasketCount;
    }

    public static void increaseAllBasketCount(int count) {
        Basket.allBasketCount = Basket.allBasketCount + count;
    }

    public static void increaseallBasketPrice(int totalPrice) {
        Basket.allBasketPrice = Basket.allBasketPrice + totalPrice;
    }

    public static void increaseallBasketItems(int totalItemsCount) {
        Basket.allBasketItems = Basket.allBasketItems + totalItemsCount;
    }

    public void add(String name, int price) {
        add(name, price, 1, 0);
    }

    public void add(String name, int price, int itemsCount) {
        add(name, price, itemsCount,0 );
    }
    public void add(String name, int price, int itemsCount, double weight) {
        boolean error = false;
        if (contains(name)) {
            error = true;
        }

        if (totalPrice + itemsCount * price >= limit) {
            error = true;
        }

        if (error) {
            System.out.println("Error occured :(");
            return;
        }

        items = items + "\n" + name + " - " +
            itemsCount + " шт. - " + price;
        totalPrice = totalPrice + itemsCount * price;
        totalWeight = totalWeight + weight;
        totalItemsCount = totalItemsCount + itemsCount;

        increaseallBasketPrice(totalPrice);
        increaseallBasketItems(totalItemsCount);
    }

    public void clear() { // сюда надо добавлять изменения в статических переменных? они же тоже меняются?
        items = "";
        totalPrice = 0;
        totalWeight = 0;
        allBasketItems = allBasketItems - totalItemsCount;
        allBasketPrice = allBasketPrice - totalPrice;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public double getTotalWeight() {
        return totalWeight;
    }

    public boolean contains(String name) {
        return items.contains(name);
    }

    public void print(String title) {
        System.out.println(title);
        if (items.isEmpty()) {
            System.out.println("Корзина пуста");
        } else {
            System.out.println(items);
        }
    }
}
