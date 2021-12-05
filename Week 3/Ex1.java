public class Ex1 {
    public static void main(String[] args) {
        System.out.println(toBase10("101010"));
    }

    public static int toBase10(String binary) {
        int output = 0;
        char[] digit = binary.toCharArray();

        for (int i = 0; i < binary.length(); i++) {
            output += digit[i] == '1' ? Math.pow(2, binary.length() - i - 1) : 0;
        }
        
        return output;
    }
}