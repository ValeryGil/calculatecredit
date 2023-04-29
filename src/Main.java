public class Main {

    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        int sumCredit = 1_000_000; //Сумма кредита
        int month = 12; //Количество месяцев до погашения кредита
        double percentCredit = 9.99; //Процент кредита

        double monthPayment = (int) (service.calculate(sumCredit, month, percentCredit));

        System.out.println("Ежемесячеый платеж = " + Math.round(monthPayment) + " руб.");
        System.out.println("Процентная ставка = " + percentCredit + " %");
    }
}
