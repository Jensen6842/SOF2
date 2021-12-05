import java.util.ArrayList;
import java.util.Arrays;

public class TextUtils {
    public static void main(String[] args) {
        System.out.println(Arrays.asList(split("Nice, Cock Leif", ",! ")));
    }

    public static String[] split(String text) {
        ArrayList<String> output = new ArrayList<String>();
        char[] character = text.toCharArray();
        String word = "";

        for (int i = 0; i < text.length(); i++) {
            if (character[i] != ' ') {
                word += character[i];
            } else {
                output.add(word);
                word = "";
            }
        }
        if (word != "") {
            output.add(word);
        }
        String output2[] = output.toArray(new String[output.size()]);
        return output2;
    }
    public static String[] split(String text, String seperators){
        ArrayList<String> output = new ArrayList<String>();
        char[] character = text.toCharArray();
        String word = "";

        for (int i = 0; i < text.length(); i++) {
            if (!seperators.contains(Character.toString(character[i]))) { 
                word += character[i];
            } else {
                if (word != "") {
                    output.add(word);
                }
                word = "";
            }
        }
        if (word != "") {
            output.add(word);
        }
        String output2[] = output.toArray(new String[output.size()]);
        return output2;
    }
    public static Integer[][] rasterise(int[] data, int width){
        return null;
    }
}
