package p99codingbat;

public class WarmUp1 {
	public boolean parrotTrouble(boolean talking, int hour) {
	return talking && (hour < 7 || hour > 20);
	}

	public boolean makes10(int a, int b) {
	return ( a == 10 || b == 10 || a + b == 10);
	}
	
	
	public int sumDouble(int a, int b) {
		int sum = a + b;

		return (a == b) ? sum * 2 : sum;
	}

}