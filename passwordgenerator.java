import java.util.Random;

public class passwordgenerator {
    private static final String UPPERCASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String LOWERCASE = "abcdefghijklmnopqrstuvwxyz";
    private static final String DIGITS = "0123456789";
    private static final String SPECIAL_CHARACTERS = "!@#$%^&*()-_=+[]{}|;:',.<>?/~`";

    public static void main(String[] args) {
        int passwordLength = 12; // specify the length of the password
        boolean useUppercase = true;
        boolean useLowercase = true;
        boolean useDigits = true;
        boolean useSpecialCharacters = true;

        String generatedPassword = generatePassword(passwordLength, useUppercase, useLowercase, useDigits, useSpecialCharacters);
        System.out.println("Generated Password: " + generatedPassword);
    }

    public static String generatePassword(int length, boolean useUppercase, boolean useLowercase, boolean useDigits, boolean useSpecialCharacters) {
        StringBuilder password = new StringBuilder(length);
        Random random = new Random();

        String characterPool = "";
        if (useUppercase) {
            characterPool += UPPERCASE;
        }
        if (useLowercase) {
            characterPool += LOWERCASE;
        }
        if (useDigits) {
            characterPool += DIGITS;
        }
        if (useSpecialCharacters) {
            characterPool += SPECIAL_CHARACTERS;
        }

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characterPool.length());
            password.append(characterPool.charAt(index));
        }

        return password.toString();
    }
}
