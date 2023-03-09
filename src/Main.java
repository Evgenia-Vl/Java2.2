public class Main {
    public static void main(String[] args) {

        int balance = 100; // начальный остаток на счете
        int addition = 1000; // сумма пополнения
        int bonus = addition / 100; // расчет бонуса
        if (addition >= 1000) {
            System.out.println(bonus = addition / 100);
        } else {
            System.out.println(bonus = 0);
        }

        int finalBalance = balance + addition + bonus;

        System.out.println(finalBalance);
    }
}