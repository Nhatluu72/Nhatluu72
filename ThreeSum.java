import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ThreeSum {

	public static void main(String[] args) {

		int[] nums = { 1, 2, 3 };
		System.out.println(threeSum(nums));
	}

	public static List<List<Integer>> threeSum(int[] nums) {

		ArrayList<List<Integer>> result = new ArrayList<>();
		int i, j, k;

		Arrays.sort(nums);
		for (i = 0; i < nums.length; i++) {
			for (j = i + 1; j < nums.length; j++) {
				for (k = j + 1; k < nums.length; k++) {
					if (i != j && i != k && j != k && nums[i] + nums[j] + nums[k] == 0) {
						List<Integer> triplet = new ArrayList<>();

						triplet.add(nums[i]);
						triplet.add(nums[j]);
						triplet.add(nums[k]);

						result.add(triplet);
					}
				}
			}
		}
		return result;
	}
}