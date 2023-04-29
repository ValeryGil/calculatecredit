public class CreditPaymentService {

    public double calculate(int sumCredit, int month, double percentCredit) {
        double monthPercent = percentCredit / (100 * 12); //Месячная процентная ставка
        double result = sumCredit * ((monthPercent * Math.pow((1 + monthPercent), month)) / (Math.pow((1 + monthPercent), month) - 1));
        return result;
    }
}
