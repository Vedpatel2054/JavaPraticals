import java.util.Scanner;

public class pr7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows for the pattern: ");
        int numRows = scanner.nextInt();
        System.out.println("Right-angled triangle pattern:");

        for (int i = 1; i <= numRows; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println(); 
        }
        scanner.close();
    }
}
