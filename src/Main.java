public class Main {
    public static void main(String[] args) {
        String st = String.format("%.1f", BmiService.calculate(160, 60));
        System.out.println("BMI = " + st);
    }
}
