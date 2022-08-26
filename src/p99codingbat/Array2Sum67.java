package p99codingbat;

public class Array2Sum67{ 
	

	public int sum67(int[] nums) {
		int sum = 0;

		boolean stop = false;

		for (int num : nums) {
			if (num == 6) {
				stop = true;
			}

			if (!stop) {
				sum += num;
			}

			if (num == 7) {
				stop = false;
			}
		}

		return sum;
	}
}