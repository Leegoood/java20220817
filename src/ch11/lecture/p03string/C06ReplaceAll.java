package ch11.lecture.p03string;

public class C06ReplaceAll {
	public static void main(String[] args) {
		String s1 = "hashcode is a code of instance";
		String t1 = s1.replace("code", "코드");
		System.out.println(t1);
		
		String t2 = s1.replaceAll("code", "코드"); // pattern을 받는다
		System.out.println(t2);
		
		String t3 = s1.replaceAll(".{3}e", "코드");  // .{3}e  = regular expression(regex) = 정규표현식, 정규식표현
		System.out.println(t3);       // 정규 표현식, 또는 정규식은 문자열에서 특정 문자 조합을 찾기 위한 패턴입니다.
	}
}
