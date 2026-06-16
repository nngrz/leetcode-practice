class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {

        int numberOfLandRides = landStartTime.length;
        int numberOfWaterRides = waterStartTime.length;
        int earliestFinishTime = Integer.MAX_VALUE;

        for (int i = 0; i < numberOfLandRides; i++) {
            for (int j = 0; j < numberOfWaterRides; j++) {
                int lst_i = landStartTime[i];
                int ld_i = landDuration[i];
                int wst_j = waterStartTime[j];
                int wd_j = waterDuration[j];

                // first land, then water
                int finish1 = Math.max(lst_i + ld_i, wst_j) + wd_j;
                // first water, then land
                int finish2 = Math.max(wst_j + wd_j, lst_i) + ld_i;

                earliestFinishTime = Math.min(earliestFinishTime, Math.min(finish1, finish2));
            }
        }
        return earliestFinishTime;
    }
}

public class EarliestFinishTimeForLandAndWaterRidesI {
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Example 1
        int[] landStartTime1 = {2, 8};
        int[] landDuration1 = {4, 1};
        int[] waterStartTime1 = {6};
        int[] waterDuration1 = {3};

        int result1 = sol.earliestFinishTime(
                landStartTime1,
                landDuration1,
                waterStartTime1,
                waterDuration1
        );
        System.out.println("Example 1 Output: " + result1);

        // Example 2
        int[] landStartTime2 = {5};
        int[] landDuration2 = {3};
        int[] waterStartTime2 = {1, 8};
        int[] waterDuration2 = {4, 1};

        int result2 = sol.earliestFinishTime(
                landStartTime2,
                landDuration2,
                waterStartTime2,
                waterDuration2
        );
        System.out.println("Example 2 Output: " + result2);

        // Extra test 1
        int[] landStartTime3 = {1, 4};
        int[] landDuration3 = {2, 3};
        int[] waterStartTime3 = {2, 6};
        int[] waterDuration3 = {4, 1};

        int result3 = sol.earliestFinishTime(
                landStartTime3,
                landDuration3,
                waterStartTime3,
                waterDuration3
        );
        System.out.println("Extra Test 1 Output: " + result3);

        // Extra test 2
        int[] landStartTime4 = {3};
        int[] landDuration4 = {5};
        int[] waterStartTime4 = {2};
        int[] waterDuration4 = {6};

        int result4 = sol.earliestFinishTime(
                landStartTime4,
                landDuration4,
                waterStartTime4,
                waterDuration4
        );
        System.out.println("Extra Test 2 Output: " + result4);
    }
}
