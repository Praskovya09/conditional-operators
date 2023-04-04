public class Main {
    public static void main(String[] args) {

        int remains =100;
        int replenishment =1000;
        int bonus;

        if (replenishment > 999) {
            bonus = replenishment / 100;
        }
        else {
            bonus = 0;
        }

        int balance = remains + replenishment + bonus;
        System.out.println( "Ваш баланс: " + balance + " руб. Ваш бонус: " + bonus + " руб.");
    }
}
