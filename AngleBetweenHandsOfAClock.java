class Solution {
    public double angleClock(int hour, int minutes) {
        double minuteAngle = minutes * 6;
        double hourAngle = ((hour % 12) + (minutes / 60.0)) * 30;

        double diff = Math.abs(minuteAngle - hourAngle);
        return Math.min(diff, 360 - diff);
    }
}

public class AngleBetweenHandsOfAClock {
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Example 1
        int hour1 = 12;
        int minutes1 = 30;
        double result1 = sol.angleClock(hour1, minutes1);
        System.out.println("Example 1 Output: " + result1); // expected: 165.0

        // Example 2
        int hour2 = 3;
        int minutes2 = 30;
        double result2 = sol.angleClock(hour2, minutes2);
        System.out.println("Example 2 Output: " + result2); // expected: 75.0

        // Extra test 1
        int hour3 = 3;
        int minutes3 = 15;
        double result3 = sol.angleClock(hour3, minutes3);
        System.out.println("Extra Test 1 Output: " + result3); // expected: 7.5

        // Extra test 2
        int hour4 = 4;
        int minutes4 = 50;
        double result4 = sol.angleClock(hour4, minutes4);
        System.out.println("Extra Test 2 Output: " + result4);

        // Extra test 3
        int hour5 = 12;
        int minutes5 = 0;
        double result5 = sol.angleClock(hour5, minutes5);
        System.out.println("Extra Test 3 Output: " + result5); // expected: 0.0

        // Extra test 4
        int hour6 = 6;
        int minutes6 = 0;
        double result6 = sol.angleClock(hour6, minutes6);
        System.out.println("Extra Test 4 Output: " + result6); // expected: 180.0
    }
}
