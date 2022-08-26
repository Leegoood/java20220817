package p99codingbat;

public class WarmUp5Array {
	public boolean commonEnd(int[] a, int[] b) {
		  boolean sameFirst = a[0]==b[0];
		  boolean sameLast = a[a.length-1]==b[b.length-1];
		  return sameFirst || sameLast;
		}

}
