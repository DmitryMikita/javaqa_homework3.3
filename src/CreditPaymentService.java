public class CreditPaymentService {
    public int calculate(int amount, int term, double interestRateMounth) {
        double monthlyPayment;
        monthlyPayment = interestRateMounth * (Math.pow((1 + interestRateMounth), term)) / (Math.pow((1 + interestRateMounth), term) - 1) * amount;
        return (int) monthlyPayment;
    }


}
