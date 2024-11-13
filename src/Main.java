public class Main {
    public static void main(String[] args) {
        int clientAccount = 500;
        int accountReplenishment = 1001;
        int bonus = (accountReplenishment > 1000) ? accountReplenishment / 100 : 0;
        clientAccount = clientAccount + accountReplenishment + bonus;
        System.out.println("Итоговый счёт клиента" + clientAccount + " руб.");
        System.out.println("Из них начислено бонусных " + bonus + " руб.");
    }
}