package u_2_ex_5;

public class PizzaOrder {
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

    public Sizes getSize() {
        return size;
    }

    public void setSize(Sizes size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSoysNeeded() { return is_soys_needed; }

    public void setSoysNeeded(boolean soys_needed) {
        is_soys_needed = soys_needed;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
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

    @Override
    public String toString() {
        return "Пицца: " + name + ", Размер: " + size + ", Соус: " +
                (is_soys_needed ? "нужен" : "не нужен") + ", Адрес: " + adress;
    }
}
