package p99codingbat;

public class Warmup1NotString {
	public String notString(String str) {
		  if (str.length() >= 3 && str.substring(0, 3).equals("not")) {
		    return str;
		  }
		  
		  return "not " + str;
		}
	
}
