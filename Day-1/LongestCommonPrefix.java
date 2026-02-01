//LEETCODE-14

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0){
            return "";
        }

        int minLength = Integer.MAX_VALUE;

        for(String s : strs){
            minLength = Math.min(s.length(), minLength);
        }

        int i = 0;
        while(i<minLength){
            for (String s : strs) {
                if (s.charAt(i) != strs[0].charAt(i)) {
                    return strs[0].substring(0, i);
                }
            }
            i++;
        }
        return strs[0].substring(0, minLength);
    }
}