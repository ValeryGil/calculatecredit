public class CreditPaymentService {

    public double calculate(int sumCredit, int month, double monthPercent) {
        double result = sumCredit * ((monthPercent * Math.pow((1 + monthPercent), month)) / (Math.pow((1 + monthPercent), month) - 1));
        return result;
    }
}
