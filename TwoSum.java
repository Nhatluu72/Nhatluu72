class TwoSum {

	public static int[] twoSum(int[] nums, int target) {

		int i, j;

		for (i = 0; i < nums.length; i++) {

			for (j = i + 1; j < nums.length; i++) {

				if (nums[i] + nums[j] == target) {
					return new int[] { i, j };
				}
			}

		}
		return new int[] {};

	}
}