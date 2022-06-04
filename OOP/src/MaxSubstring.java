import java.util.List;

public class MaxSubstring {

    public static int MaxSubstring (List<Character> chars) {
        int max = 0;
        int n = chars.size();

        for (int i=0; i<n; i++) {
            for(int j=i; j<n; j++) {
                while (chars[i] != chars[j])
            }

        }

        return max;
    }
}
