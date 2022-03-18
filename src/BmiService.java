public class BmiService {
    public static double calculate() {

        double height = 0.16; // метры - рост
        double weight = 60.00; // килограммы - вес
        return ((weight / (Math.pow(height, 2))) / 100);
    }
}
