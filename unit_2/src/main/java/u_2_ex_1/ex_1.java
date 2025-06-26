package u_2_ex_1;

public class ex_1 {
    public static void main(String[] args) {
        Phone phone1 = new Phone();
        phone1.weight = 1;

        phone1.receiveCall("Kaleb");
        System.out.println(phone1.getNumber());

        String[] massive = {"+79517833", "+79485519"};
        phone1.sendMessage(massive);

        Phone phone2 = new Phone("+7951", "500");
        phone2.weight = 0.5;

        phone2.receiveCall("Sergey", "+7978");
        System.out.println(phone2.getNumber());

        System.out.println(phone2.toString());
    }

    public static class Phone {
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

        public String toString() {
            return this.number + " " + this.model + " " + this.weight;
        }
    }
}
