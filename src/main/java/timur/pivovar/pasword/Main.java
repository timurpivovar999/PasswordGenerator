package timur.pivovar.pasword;

import java.security.SecureRandom;
import java.util.Scanner;

public class Main {

    private static final String CHAR_LOWER = "abcdefghijklmnopqrstuvwxyz";
    private static final String CHAR_UPPER = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String NUMBER = "0123456789";
    private static final String OTHER_CHAR = "!@#$%&?";

    private static final String PASSWORD_CHAR_SET = CHAR_LOWER + CHAR_UPPER + NUMBER + OTHER_CHAR;
    private static SecureRandom random = new SecureRandom();

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи длину пароля: ");
        int passwordLength = scanner.nextInt();
        System.out.println("Сгенерированный пароль: " + generateRandomPassword(passwordLength));
    }

    public static String generateRandomPassword(int length)
    {
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(PASSWORD_CHAR_SET.length());
            password.append(PASSWORD_CHAR_SET.charAt(randomIndex));
        }

        return password.toString();
    }
}
