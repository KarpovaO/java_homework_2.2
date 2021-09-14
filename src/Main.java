public class Main {
    public static void main(String[] args) {
        int account = 100;
        int deposit = 1100;
        int totalAmount = account + deposit;
        int bonus = deposit / 100;
        if (deposit > 1000) {

            System.out.println(totalAmount + bonus + "р. бонус = " + bonus);
        } else {
            System.out.println("сумма = " + totalAmount + " (р. бонусов нет)");
        }
    }
}