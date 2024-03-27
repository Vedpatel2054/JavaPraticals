public class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}

public class ThrowsCustomException1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        try {
            isNumberPositive(num);
        } catch (NegativeNumberException e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("The number is " + num);
    }

    private static void isNumberPositive(int num) throws NegativeNumberException {
        if (num < 0) {
            throw new NegativeNumberException("Negative numbers are not allowed.");
        }
    }
}