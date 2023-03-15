public class BmiService {
    public int calculate(double heightCm, int weightKg) {
        int result = (int) (weightKg / (heightCm * heightCm));
        return result;
    }
}