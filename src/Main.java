public class Main {
    public static void main(String[] args) {

        // Задание 2
        System.out.println("Задание № 2");
        BmiService bmiService = new BmiService();

        int bmi = bmiService.calculate(1.87, 98);
        System.out.println("Результат = " + bmi);
    }
}
