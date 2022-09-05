package ch10.book.s1007;

public class BalanceInsufficientException  extends Exception{
	public BalanceInsufficientException() {	
	}
	public BalanceInsufficientException(String message) {
		super(message);
	}
}
