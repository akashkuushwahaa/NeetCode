//https://neetcode.io/problems/anagram-groups/question?list=neetcode150

package solutions.arrays_strings;

import java.util.*;

public class GroupAnagramsMain {

    public static void main(String[] args) {

        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};

        GroupAnagramsSolution sol = new GroupAnagramsSolution();
        List<List<String>> result = sol.groupAnagrams(strs);

        System.out.println(result);
    }
}

class GroupAnagramsSolution {

    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<>();

        for (String s : strs) {

            int[] count = new int[26];

            for (char c : s.toCharArray()) {
                count[c - 'a']++;
            }

            String key = Arrays.toString(count);

            map.putIfAbsent(key, new ArrayList<>());

            map.get(key).add(s);
        }

        // Return grouped anagrams
        return new ArrayList<>(map.values());
    }
}
