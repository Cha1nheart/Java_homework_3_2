public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double heightCm = 1.87;
        int weightKg = 98;
        int index = service.calculate(heightCm, weightKg); // должно получиться 28
        System.out.println(index);
    }
}