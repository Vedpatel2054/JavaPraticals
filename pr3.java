import java.util.Scanner;

public class pr3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a single character: ");
        String userInput = scanner.nextLine();

        if (userInput.length() == 1 && Character.isLetter(userInput.charAt(0))) {
            char inputChar = Character.toLowerCase(userInput.charAt(0));

            if (isVowel(inputChar)) {
                System.out.println("Vowel");
            } else {
                System.out.println("Consonant");
            }
        } else {
            System.out.println("Error: Please enter a single alphabetical character.");
        }
        scanner.close();
    }

    private static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}