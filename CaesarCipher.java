public class CaesarCipher {

    public String encrypt(String text, int shift) {
        return performShift(text, shift);
    }

    public String decrypt(String text, int shift) {
        return performShift(text, -shift);
    }

    private String performShift(String text, int shift) {
        StringBuilder result = new StringBuilder();

        for (char character : text.toCharArray()) {
            if (Character.isLetter(character)) {
                char base = Character.isLowerCase(character) ? 'a' : 'A';
                int shifted = (character - base + shift + 26) % 26;
                result.append((char) (base + shifted));
            } else {
                result.append(character);
            }
        }
        return result.toString();
    }
}
