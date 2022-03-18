public class Main {
    public static void main(String[] args) {
        String formattedDouble = String.format("%.1f", BmiService.calculate());
        System.out.println("BMI = " + formattedDouble);
    }
}
