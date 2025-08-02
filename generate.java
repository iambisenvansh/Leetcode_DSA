import java.util.*;

class Solution {
    // Function to generate Pascal's Triangle
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascal = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();

            for (int j = 0; j <= i; j++) {
                // First and last elements are always 1
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    // Sum of two elements from the previous row
                    int prev1 = pascal.get(i - 1).get(j - 1);
                    int prev2 = pascal.get(i - 1).get(j);
                    row.add(prev1 + prev2);
                }
            }

            pascal.add(row);
        }

        return pascal;
    }

    // Main method to test the generate() function
    public static void main(String[] args) {
        Solution sol = new Solution();

        int numRows = 5;  // You can change this to test with more rows
        List<List<Integer>> result = sol.generate(numRows);

        // Print Pascal's Triangle
        System.out.println("Pascal's Triangle with " + numRows + " rows:");
        for (List<Integer> row : result) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
