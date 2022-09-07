package ch11.book.s1103;

public class S110303SmartPhone {
	private String company;
	private String os;
	
	public S110303SmartPhone(String company, String os) {
		this.company = company;
		this.os = os;
	}

	@Override
	public String toString() {
		return  company + "," + os ;  // toString()재정의
	}
	
}
