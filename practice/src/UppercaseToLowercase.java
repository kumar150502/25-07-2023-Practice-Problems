public class UppercaseToLowercase {
    public static void main(String[] args) {
        String input = "KUMAR";
        String converted = convertToLowerCase(input);
        System.out.println("Original: " + input);
        System.out.println("Converted: " + converted);
    }
    public static String convertToLowerCase(String input) {
        char[] charArray = input.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char ch = charArray[i];
            if (ch >= 'A' && ch <= 'Z') {
                charArray[i] = (char) (ch + 32);
            }
        }
        return new String(charArray);
    }
}
