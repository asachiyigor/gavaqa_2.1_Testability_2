public class BmiService {
    public static double calculate(int heightSm, int weightKg) {

//        double heightSm = 0.16; // метры - рост
//        double weightKg = 60.00; // килограммы - вес

        double  heightM = (double) heightSm/1000;
        return ((weightKg / (Math.pow((heightM), 2))) / 100);
    }
}
