import java.util.Arrays;

public class MoveZeroes {

	public static void main(String[] args) {

		int[] nums = { 0, 1, 0, 3, 12 };
		int[] num = { 0 };

		moveZeroes(nums);
		moveZeroes(num);

		System.out.println(Arrays.toString(nums));
		System.out.println(Arrays.toString(num));

	}

	public static void moveZeroes(int[] nums) {

		// creating a currIndex to swap the elements with the original elements
		int currIndex = 0;

		// iterate through the array
		for (int i = 0; i < nums.length; i++) {

			// swapping elements
			if (nums[i] != 0) {

				int temp = nums[currIndex];
				nums[currIndex] = nums[i];
				nums[i] = temp;
				currIndex++;
			}

		}
	}

}
