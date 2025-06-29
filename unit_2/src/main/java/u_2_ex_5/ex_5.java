package u_2_ex_5;

public class ex_5 {
    public static void main(String[] args) {
        PizzaOrder order = new PizzaOrder(PizzaOrder.Sizes.BIG, "ул. хлюстова", true, "пеперони");
        System.out.println(order + "\n");
        order.order();
        order.order();
        order.cancel();
        order.cancel();
    }
}
