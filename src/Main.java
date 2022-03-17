public class Main {
    public static void main(String[] args) {

        int clientAccount = 100;
        int entrance = 100;
        int bonus = entrance / 100;
        int totalAmount = clientAccount + entrance + bonus;

        if (entrance<1000) {
            System.out.println("сумма счета" + (clientAccount + entrance) + "рублей");
        }
        else {
            System.out.println("сумма счета" + (totalAmount) + "рублей");
        }






        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        // Условным оператором проверяете превысила ли
        // сумма пополнения порог и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
    }
}

