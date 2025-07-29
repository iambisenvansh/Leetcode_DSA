import java.util.Arrays;

public class Maximum_bitwiseXOR {

    public static int[] smallestSubarrays(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int[] bitPos = new int[32]; // To store last seen positions of each bit

        Arrays.fill(bitPos, -1); // Initialize with -1

        for (int i = n - 1; i >= 0; i--) {
            for (int b = 0; b < 32; b++) {
                if ((nums[i] & (1 << b)) != 0) {
                    bitPos[b] = i;
                }
            }

            int maxReach = i;
            for (int pos : bitPos) {
                if (pos != -1) {
                    maxReach = Math.max(maxReach, pos);
                }
            }

            ans[i] = maxReach - i + 1;
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1, 0, 2, 1, 3};  // Example input
        int[] result = smallestSubarrays(nums);

        System.out.println("Result: " + Arrays.toString(result));
    }
}
