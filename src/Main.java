public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        int annuity = service.calculate(1_000_000, 9.99, 12);
        System.out.println(annuity);

        int annuity2 = service.calculate(1_000_000, 9.99, 24);
        System.out.println(annuity2);

        int annuity3 = service.calculate(1_000_000, 9.99, 36);
        System.out.println(annuity3);
    }
}
