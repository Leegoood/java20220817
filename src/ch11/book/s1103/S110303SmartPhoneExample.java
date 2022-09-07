package ch11.book.s1103;

public class S110303SmartPhoneExample {
	public static void main(String[] args) {
		S110303SmartPhone myPhone = new S110303SmartPhone("구글", "안드로이드");
		
		String strObj = myPhone.toString();
		System.out.println(strObj);
		System.out.println(myPhone);  // myPhone.toString()을 자동호출해서 리턴값을 얻은 후 출력
	}
}
