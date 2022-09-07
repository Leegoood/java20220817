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
	
	public String backAround(String str) {
		  char lastChar = str.charAt(str.length()-1);
		  String res = lastChar + str + lastChar;
		  
		  return res; 
		}
	
	public String everyNth(String str, int n) {
		  String res = "";
		  
		  for(int i = 0; i < str.length(); i +=n){
		    char c = str.charAt(i);
		    res += c;
		  }
		  return res;
		}


}