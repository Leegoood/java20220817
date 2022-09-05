package ch10.book.exercise.p06;

public class TryCatchFinallyExample {
	public static void main(String[] args) {
		String[]strArray = {"10" , "2a"};
		int value = 0;
		for(int i = 0; i <= 2 ; i++) {    
			try {
				value = Integer.parseInt(strArray[i]);   
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("인덱스를 초과했음"); // str배열의 길이는 2이고 포문은 3번실행,  익셉션발생
			}catch(NumberFormatException e) {
				System.out.println("숫자로 변환할 수 없음."); // 숫자로 변환할수 없는 2a , 넘버포맷익셉션 발생
			}finally {
				System.out.println(value); 
			}
			
		}
	}
}
