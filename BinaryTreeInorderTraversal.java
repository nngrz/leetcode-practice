import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {}

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        // TODO
        return new ArrayList<>();
    }
}

public class BinaryTreeInorderTraversal {
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Example 1: [1,null,2,3]
        TreeNode root1 = new TreeNode(1);
        root1.right = new TreeNode(2);
        root1.right.left = new TreeNode(3);

        List<Integer> result1 = sol.inorderTraversal(root1);
        System.out.println("Example 1 Output: " + result1); // expected: [1, 3, 2]

        // Example 2: [1,2,3,4,5,null,8,null,null,6,7,9]
        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(3);

        root2.left.left = new TreeNode(4);
        root2.left.right = new TreeNode(5);
        root2.right.right = new TreeNode(8);

        root2.left.right.left = new TreeNode(6);
        root2.left.right.right = new TreeNode(7);
        root2.right.right.left = new TreeNode(9);

        List<Integer> result2 = sol.inorderTraversal(root2);
        System.out.println("Example 2 Output: " + result2); // expected: [4, 2, 6, 5, 7, 1, 3, 9, 8]

        // Extra test 1: empty tree
        TreeNode root3 = null;
        List<Integer> result3 = sol.inorderTraversal(root3);
        System.out.println("Extra Test 1 Output: " + result3); // expected: []

        // Extra test 2: single node
        TreeNode root4 = new TreeNode(1);
        List<Integer> result4 = sol.inorderTraversal(root4);
        System.out.println("Extra Test 2 Output: " + result4); // expected: [1]

        // Extra test 3
        TreeNode root5 = new TreeNode(2);
        root5.left = new TreeNode(1);
        root5.right = new TreeNode(3);

        List<Integer> result5 = sol.inorderTraversal(root5);
        System.out.println("Extra Test 3 Output: " + result5); // expected: [1, 2, 3]
    }
}
