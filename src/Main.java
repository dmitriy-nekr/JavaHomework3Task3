public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        System.out.println("12 месяцев");
        System.out.println("Ваш ежемесячный платеж = " + service.calculate(1000000, 9.99, 12));

        System.out.println("24 месяца");
        System.out.println("Ваш ежемесячный платеж = " + service.calculate(1000000, 9.99, 24));


        System.out.println("36 месяцев");
        System.out.println("Ваш ежемесячный платеж = " + service.calculate(1000000, 9.99, 36));
    }

}
