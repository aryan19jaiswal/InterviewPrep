//LEETCODE-224

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram{
    public boolean isAnagram(String s, String t) {
        int len1 = s.length();
        int len2 = t.length();

        if (len1 != len2) {
            return false;
        }

        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        for(char c : s.toCharArray()){
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }

        for(char c : t.toCharArray()){
            map2.put(c, map2.getOrDefault(c, 0) + 1);
        }

        return map1.equals(map2);
    }
}