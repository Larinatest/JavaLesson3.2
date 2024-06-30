public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        double heightM = 1.87;
        double weightKg = 98;

        int bmi = service.calculate(weightKg, heightM);

        System.out.println("Рост: " + heightM + " м");
        System.out.println("Вес: " + weightKg + " кг");
        System.out.println("Индекс массы тела (BMI): " + bmi);
    }
    }
