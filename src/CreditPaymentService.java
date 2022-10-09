public class CreditPaymentService {
    public int calculate(int startCredit, double percentYear, int monthAmount) {

        double percentMonth = percentYear / 12 / 100;
        double kAnnuity = percentMonth * Math.pow((1 + percentMonth), monthAmount) / (Math.pow((1 + percentMonth), monthAmount) - 1);
        double monthPayment = startCredit * kAnnuity;
        int finalMonthPayment = (int) monthPayment;
        return finalMonthPayment;

    }
}
