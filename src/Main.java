public class Main {
    public static void main(String[] args) {
        int account = 200;
        int deposit = 1050;
        int totalAmount = account + deposit;
        int bonus = deposit > 1000 ? (deposit / 100) : 0;
        totalAmount += bonus;
        System.out.println("средств на счете: " + totalAmount);
        System.out.println("бонусов начислено: " + bonus);
    }
}

