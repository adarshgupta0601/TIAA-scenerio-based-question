import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("BMI Calculator");
        System.out.print("Enter your weight in kilograms: ");
        double weight = scanner.nextDouble();

        System.out.print("Enter your height in centimeters: ");
        double heightCM = scanner.nextDouble();

        // Convert height to meters
        double heightM = heightCM / 100;

        // Calculate BMI
        double bmi = weight / (heightM * heightM);

        // Determine BMI category
        String category;
        if (bmi < 18.5) {
            category = "Underweight";
        } else if (bmi < 25) {
            category = "Normal weight";
        } else if (bmi < 30) {
            category = "Overweight";
        } else {
            category = "Obesity";
        }

        // Display results
        System.out.println("Your BMI: " + bmi);
        System.out.println("BMI Category: " + category);

        scanner.close();
    }
}
