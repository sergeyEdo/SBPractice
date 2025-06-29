package u_2_ex_1;

public class Ex_1 {
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
}

