import java.util.ArrayList;
import java.util.List;

public class Conversion {
    public static List<Character> strToChar (String s) {
        List<Character> chars = new ArrayList<>();

        for (char ch: s.toCharArray()) {
            chars.add(ch);
        }
        System.out.println(chars);
        return chars;
    }

}
