package p99codingbat;

public class WarmUp2 {	
		public boolean posNeg(int a, int b, boolean negative) {
			  
			  if(negative){
			    return a< 0 && b < 0;
			  } else{
			    return a*b<0;
			  }
			}
}
