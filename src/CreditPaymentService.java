public class CreditPaymentService {
    public int calculate(int credit, double percent, int months) {

        double monthPercent = percent / 12 / 100;
        double degree = Math.pow((1 + monthPercent), months);
        double coefficientAnnuity = (monthPercent * degree / (degree - 1));

        int annuity = (int) (coefficientAnnuity * credit);
        return annuity;

    }
}
