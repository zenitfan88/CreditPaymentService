public class MonthlyPayment {
    public double calculate(int amount, int period) {
        double percent = 9.99;
        double monthPercent = percent / (12*100) ;
        double monthPercentPlusOne = monthPercent + 1 ;
        double monthPercentDegree = Math.pow(monthPercentPlusOne, period);
        double ratio = (monthPercent*monthPercentDegree)/(monthPercentDegree-1);
        double payment = amount*ratio;
        return payment;
    }
}
