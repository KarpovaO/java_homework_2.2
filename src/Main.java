public class Main {
    public static void main(String[] args) {
        int account = 100;
        int deposit = 1100;
        int totalAmount = account + deposit;
        if (deposit > 1000) { int bonus = deposit / 100;

            System.out.println(totalAmount + bonus + "р. бонус = " + bonus);}
        else{
            System.out.println("сумма = " + totalAmount + " (р. бонусов нет)");
        }
    }
}