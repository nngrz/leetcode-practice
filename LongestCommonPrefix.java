class Solution {
    public String longestCommonPrefix(String[] strs) {

        String shortest = strs[0];
        // find the shortest word
        for (String i : strs) {
            if (i.length() < shortest.length()) {
                shortest = i;
            }
        }

        // use the shortest word as prefix,
        // compare the shortest word with others
        String strPrefix = shortest;
        for (String i : strs) {
            while (!i.startsWith(strPrefix)) {
                strPrefix = strPrefix.substring(0, strPrefix.length() - 1);

                // if prefix is emply, means no shared prefix
                if (strPrefix.isEmpty()) {
                    return "";
                }
            }
        }
        return strPrefix;
    }
}

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs1 = {"flower","flow","flight"};
        String[] strs2 = {"dog","racecar","car"};

        Solution solution = new Solution();
        String result1 = solution.longestCommonPrefix(strs1);
        System.out.println(result1);
        String result2 = solution.longestCommonPrefix(strs2);
        System.out.println(result2);
    }
}
