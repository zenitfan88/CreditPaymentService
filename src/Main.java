public class Main {
    public static void main(String[] args) {
        MonthlyPayment service = new MonthlyPayment();

        double payment = service.calculate(1_000_000, 12);
        System.out.printf("Ежемесячный платеж - " + "%.0f%n", payment);

        double payment1 = service.calculate(1_000_000, 24);
        System.out.printf("Ежемесячный платеж - " + "%.0f%n", payment1);

        double payment2 = service.calculate(1_000_000, 36);
        System.out.printf("Ежемесячный платеж - " + "%.0f%n", payment2);
    }
}
