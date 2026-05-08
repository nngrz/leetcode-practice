class VersionControl {

    protected int badVersion;
    public VersionControl(int badVersion) {
        this.badVersion = badVersion;
    }

    public boolean isBadVersion(int version) {
        return version >= badVersion;
    }
}

class Solution extends VersionControl {

    public Solution(int badVersion) {
        super(badVersion);
    }

    public int firstBadVersion(int n) {

        int l = 1;
        int r = n;

        while (l < r) {
            int mid = l + (r - l) / 2;
            if (isBadVersion(mid)) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }
}

public class FirstBadVersion {
     public static void main(String[] args) {

        // Example 1: n = 5, bad = 4
        Solution sol1 = new Solution(4);
        int result1 = sol1.firstBadVersion(5);
        System.out.println("Example 1 Output: " + result1); // expected: 4

        // Example 2: n = 1, bad = 1
        Solution sol2 = new Solution(1);
        int result2 = sol2.firstBadVersion(1);
        System.out.println("Example 2 Output: " + result2); // expected: 1
    }
}
