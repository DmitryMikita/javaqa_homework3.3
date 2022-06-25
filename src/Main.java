public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        double interestRate = 9.99;
        double interestRateMounth = (interestRate / 12) / 100;
        System.out.println("На 12 месяцев");
        System.out.println("Ежемесячный платеж" + " " + service.calculate(1000000, 12, interestRateMounth) + "руб." + " " + "Процентная ставка" + " " + interestRate + "%");
        System.out.println("На 24 месяцев");
        System.out.println("Ежемесячный платеж" + " " + service.calculate(1000000, 24, interestRateMounth) + "руб." + " " + "Процентная ставка" + " " + interestRate + "%");
        System.out.println("На 36 месяцев");
        System.out.println("Ежемесячный платеж" + " " + service.calculate(1000000, 36, interestRateMounth) + "руб." + " " + "Процентная ставка" + " " + interestRate + "%");
    }

}


