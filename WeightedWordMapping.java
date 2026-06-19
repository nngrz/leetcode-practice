class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < words.length; i++) {
            String currentWord = words[i];
            int sum = 0;

            for (int j = 0; j < currentWord.length(); j++) {
                sum += weights[currentWord.charAt(j) - 'a'];
            }

            int mod = sum % 26;
            sb.append((char)('z' - mod));
        }
        return sb.toString();
    }
}

public class WeightedWordMapping {
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Example 1
        String[] words1 = {"abcd", "def", "xyz"};
        int[] weights1 = {5,3,12,14,1,2,3,2,10,6,6,9,7,8,7,10,8,9,6,9,9,8,3,7,7,2};
        String result1 = sol.mapWordWeights(words1, weights1);
        System.out.println("Example 1 Output: " + result1);
        // expected: rij

        // Example 2
        String[] words2 = {"a", "b", "c"};
        int[] weights2 = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
        String result2 = sol.mapWordWeights(words2, weights2);
        System.out.println("Example 2 Output: " + result2);
        // expected: yyy

        // Example 3
        String[] words3 = {"abcd"};
        int[] weights3 = {7,5,3,4,3,5,4,9,4,2,2,7,10,2,5,10,6,1,2,2,4,1,3,4,4,5};
        String result3 = sol.mapWordWeights(words3, weights3);
        System.out.println("Example 3 Output: " + result3);

        // Extra test 1
        String[] words4 = {"z", "zz", "zzz"};
        int[] weights4 = {1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6};
        String result4 = sol.mapWordWeights(words4, weights4);
        System.out.println("Extra Test 1 Output: " + result4);

        // Extra test 2
        String[] words5 = {"hello", "world"};
        int[] weights5 = {1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6};
        String result5 = sol.mapWordWeights(words5, weights5);
        System.out.println("Extra Test 2 Output: " + result5);
    }
}
