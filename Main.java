import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CaesarCipher cipher = new CaesarCipher();

        System.out.println("Enter the text: ");
        String inputText = scanner.nextLine();

        System.out.println("Enter shift key (0-25): ");
        int shiftKey = scanner.nextInt();

        String encrypted = cipher.encrypt(inputText, shiftKey);
        System.out.println("Encrypted text: " + encrypted);

        String decrypted = cipher.decrypt(encrypted, shiftKey);
        System.out.println("Decrypted text: " + decrypted);
    }
}
