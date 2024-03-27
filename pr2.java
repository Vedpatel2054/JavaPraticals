import java.util.Scanner;

public class pr2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the first floating-point number: ");
        double num1 = scanner.nextDouble();

       
        System.out.print("Enter the second floating-point number: ");
        double num2 = scanner.nextDouble();

        scanner.close();


        double roundedNum1 = roundToThreeDecimalPlaces(num1);
        double roundedNum2 = roundToThreeDecimalPlaces(num2);

        if (roundedNum1 == roundedNum2) {
            System.out.println("The numbers are the same up to three decimal places.");
        } else {
            System.out.println("The numbers are different.");
        }
    }
    private static double roundToThreeDecimalPlaces(double num) {
        return Math.round(num * 1000.0) / 1000.0;
    }
}
