import java.util.Scanner;

public class ElvishCodeCipher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String encryptedMessage = sc.nextLine();
        int decipher = sc.nextInt();

        for (char c : encryptedMessage.toCharArray()){
            System.out.print((char)(c - decipher));
        }
    }
}
