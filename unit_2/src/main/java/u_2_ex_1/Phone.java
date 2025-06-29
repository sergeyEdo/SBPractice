package u_2_ex_1;

public class Phone {
    private String number;
    private String model;
    double weight = 0;

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
        this.number = "+000";
        this.model = "temp_model";
    }

    public void receiveCall(String callers_name) {
        System.out.println("Звонит " + callers_name);
    }

    public void receiveCall(String callers_name, String callers_number) {
        System.out.println("Звонит " + callers_name + " : " + callers_number);
    }

    public String getNumber() {
        return this.number;
    }

    public void sendMessage(String[] arr) {
        for(String number : arr) {
            System.out.println(number);
        }
    }

    @Override
    public String toString() {
        return this.number + " " + this.model + " " + this.weight;
    }
}
