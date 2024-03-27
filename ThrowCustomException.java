public class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}

public class ThrowCustomException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        if (num < 0) {
            throw new NegativeNumberException("Negative numbers are not allowed.");
        }
        System.out.println("The number is " + num);
    }
}