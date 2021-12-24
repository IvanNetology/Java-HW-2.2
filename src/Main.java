public class Main {
    public static void main(String[] args) {
        int account = 1000;
        int deposit = 1009;
        int bonus;
        if (deposit > 1000) {
            bonus = deposit / 100;
        } else {
            bonus = 0;
        }
        int summa = bonus + deposit + account;
        System.out.println("Итоговый счет: " + summa + " руб.");
        System.out.println("Количество бонусов: " + bonus + " руб.");
    }
}
