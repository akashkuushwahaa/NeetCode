//https://neetcode.io/problems/string-encode-and-decode/question?list=neetcode150
package solutions.arrays_strings;

import java.util.*;

public class EncodeDecodeMain {

    public static void main(String[] args) {

        EncodeDecodeSolution sol = new EncodeDecodeSolution();

        List<String> input = Arrays.asList("neet","code","love","you");

        String encoded = sol.encode(input);
        System.out.println("Encoded: " + encoded);

        List<String> decoded = sol.decode(encoded);
        System.out.println("Decoded: " + decoded);
    }
}

class EncodeDecodeSolution {

    public String encode(List<String> strs) {

        if (strs.size() == 0) {
            return Character.toString((char) 258);
        }

        String separate = Character.toString((char) 257);
        StringBuilder sb = new StringBuilder();

        for (String s : strs) {
            sb.append(s);
            sb.append(separate);
        }

        sb.deleteCharAt(sb.length() - 1);

        return sb.toString();
    }

    public List<String> decode(String s) {

        if (s.equals(Character.toString((char) 258))) {
            return new ArrayList<>();
        }

        String separate = Character.toString((char) 257);

        return Arrays.asList(s.split(separate, -1));
    }
}
