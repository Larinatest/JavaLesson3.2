public class BmiService {
    public int calculate(double weightKg, double heightM) {
        double bmi = weightKg / (heightM * heightM);
        return (int) bmi;
    }
}
