import java.lang.Math;

public class MathMethods1 {
    public static void main(String[] args) {
        // Using the pow method
        double base = 2.0;
        double exponent = 3.0;
        double result = Math.pow(base, exponent);
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);

        // Using the sin method
        double angle = Math.toRadians(30.0);
        double sinValue = Math.sin(angle);
        System.out.println("The sine of " + angle + " degrees is: " + sinValue);

        // Using the cos method
        double cosValue = Math.cos(angle);
        System.out.println("The cosine of " + angle + " degrees is: " + cosValue);

        // Using the tan method
        double tanValue = Math.tan(angle);
        System.out.println("The tangent of " + angle + " degrees is: " + tanValue);

        // Using the round method
        double value = 2.8;
        long roundedValue = Math.round(value);
        System.out.println("The rounded value of " + value + " is: " + roundedValue);

        // Using the max method
        int num1 = 10;
        int num2 = 20;
        int maxValue = Math.max(num1, num2);
        System.out.println("The maximum of " + num1 + " and " + num2 + " is: " + maxValue);

        // Using the abs method
        int num3 = -10;
        int absValue = Math.abs(num3);
        System.out.println("The absolute value of " + num3 + " is: " + absValue);
    }
}