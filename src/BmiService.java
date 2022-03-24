public class BmiService {
    public static double calculate(int heightSm, int weightKg) {

        double heightM = (double) heightSm / 1000;
        return ((weightKg / (Math.pow((heightM), 2))) / 100);
    }
}
