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

    public static class PizzaOrder {
        public enum Sizes {
            SMALL,
            MEDIUM,
            BIG
        }
        private Sizes size;
        public String name;
        public boolean is_soys_needed;
        public String adress;
        public boolean is_checked;

        public PizzaOrder(Sizes size, String adress, boolean is_soys_needed, String name) {
            this.size = size;
            this.adress = adress;
            this.is_soys_needed = is_soys_needed;
            this.name = name;
            this.is_checked = false; // По умолчанию заказ не принят
        }

        public Sizes get_size() {
            return size;
        }

        public void set_size(Sizes size) {
            this.size = size;
        }

        public String get_name() {
            return name;
        }

        public void set_name(String name) {
            this.name = name;
        }

        public boolean is_soys_needed() {
            return is_soys_needed;
        }

        public void set_soys_needed(boolean soys_needed) {
            is_soys_needed = soys_needed;
        }

        public String get_adress() {
            return adress;
        }

        public void set_adress(String adress) {
            this.adress = adress;
        }

        public void order() {
            if (is_checked) {
                System.out.println("Заказ уже принят ранее.");
            } else {
                is_checked = true;
                System.out.println("Заказ принят.");
                System.out.println("Пицца " + name + " (" + size.name() + ") с " +
                        (is_soys_needed ? "соусом" : "без соуса") +
                        " на адрес: " + adress);
            }
        }

        public void cancel() {
            if (!is_checked) {
                System.out.println("Заказ не был принят.");
            } else {
                is_checked = false;
                System.out.println("Заказ отменен.");
            }
        }

        public String toString() {
            return "Пицца: " + name + ", Размер: " + size + ", Соус: " +
                    (is_soys_needed ? "нужен" : "не нужен") + ", Адрес: " + adress;
        }
    }
}
