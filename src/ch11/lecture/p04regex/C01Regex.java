package ch11.lecture.p04regex;

public class C01Regex {
	public static void main(String[] args) {
		// regular expression(regex)
		// 정규표현식, 정규식표현
		// 문자열의 패턴을 표현하는 코드(String,문자열)
		
		String str1 = "a";
		
		// 하나의 문자
		String pattern1 = "a";
		System.out.println(str1.matches(pattern1));
		
		String s2 = "b";
		String p2 = "b";
		System.out.println(s2.matches(p2));
		
		String s3 = "bb";
		String p3 = "b"; 
		
		System.out.println(s3.matches(p3));  // false
		
		String s4 = "bbb";
		String p4 = "b+";  //  + : 한 개 이상 , 0은 제외
		
		System.out.println(s4.matches(p4));  // true
		System.out.println(s3.matches(p4));  // true
		System.out.println(s2.matches(p4));  // true
		
		System.out.println("".matches(p4));  // false
		
		String p5 = "b*";  // * : 0개 이상
		System.out.println("bbb".matches(p5));
		System.out.println("bb".matches(p5));
		System.out.println("b".matches(p5));
		System.out.println("".matches(p5));
		
		String p6  = "dog";
		System.out.println("dog".matches(p6));
		
		String p7 = "do+g";
		System.out.println("dog".matches(p7));
		System.out.println("dooooog".matches(p7));
		
		String p8 = "[abcd]"; // [] : 안에 나열된 문자 중 하나
		System.out.println("a".matches(p8));
		System.out.println("b".matches(p8));
		System.out.println("c".matches(p8));
		System.out.println("e".matches(p8));  // false [] 나열된 문자여야함.
		System.out.println("A".matches(p8));  // false 대소문자 구별해야함.
		
		String p9 = "[a-c]";
		System.out.println("a".matches(p9));
		System.out.println("b".matches(p9));
		System.out.println("c".matches(p9));
		System.out.println("A".matches(p9));  // false
		System.out.println("B".matches(p9));  // false
		
		String p10 = "[a-cA-C]";  // [abcABC]
		System.out.println("a".matches(p10));
		System.out.println("b".matches(p10));
		System.out.println("c".matches(p10));
		System.out.println("abc".matches(p10));  
		
		System.out.println("abc".matches("[a-c]+"));
		
		String p11 = "[^abcdefghijkl]";  // [^] : 제외하고
		System.out.println("a".matches(p11)); //a 제외하고 이니까 false  
		System.out.println("m".matches(p11)); //m은 제외니까 true
		
		String p12 = "[^a-z]" ;
		System.out.println("a".matches(p12));
		System.out.println("A".matches(p12));
		System.out.println("9".matches(p12));
		
		String p13 = "d[^o]+g";
		System.out.println("dog".matches(p13)); // o 을 제외하고인데 포함되있어서 false
		System.out.println("dag".matches(p13));
		System.out.println("dabcdefg".matches(p13));
		
		// 수량
		// + : 1개이상
		// * : 0개 이상
		// ? : 0개 또는 1개
		// {n} : n개
		// {n,} : n개 이상
		// {n,m} : n개 이상 m개 이하
		
		
		String p14 = "do+g";
		System.out.println("dog".matches(p14));
		System.out.println("dooooooog".matches(p14));
		
		String p15 = "do*g";
		System.out.println("dog".matches(p15));
		System.out.println("dooooooog".matches(p15));
		System.out.println("dg".matches(p15));
		
		String p16 = "do?g";
		System.out.println("dog".matches(p16));// ? : 0개 또는 1개 true
		System.out.println("dg".matches(p16)); // ? : 0개 또는 1개 true
		System.out.println("doog".matches(p16)); // ? : 0개 또는 1개 false
		System.out.println("dooog".matches(p16)); // ? : 0개 또는 1개 false
		
		
		String p17 = "do{2}g";
		System.out.println("doog".matches(p17)); // true
		System.out.println("dog".matches(p17));  // o가 두번들어가야되서 false
		System.out.println("dooog".matches(p17)); // o가 두번들어가야되서 false
		
		// 기호
		// . : 모든 글자
		// \d : [0-9](digit) 0 에서 9까지
		// \w : [a-zA-Z0-9](word character)
		// \s : 공백(스페이스,엔터,탭)
		// ^ : 한 줄의 시작
		// $ : 한 줄의 끝
	
		String p18 = "."; // 모든 글자
		System.out.println("a".matches(p18));
		System.out.println(" ".matches(p18));
		System.out.println("0".matches(p18));
		System.out.println("".matches(p18));
		System.out.println("aa".matches(p18));
		System.out.println("aa".matches(".{2}"));
		
		String p19 = "\\d"; // java에서는 \는 \\로 작성
		System.out.println("0".matches(p19));
		System.out.println("5".matches(p19));
		System.out.println("a".matches(p19));
		System.out.println("".matches(p19));
		System.out.println("91".matches(p19));
		
		String p20 = "\\d{8}";
		System.out.println("19550101".matches(p20)); //8글자 true
		System.out.println("550101".matches(p20));  // 8글자 x false
		
		String p21 = "\\d{4}-?\\d{2}-?\\d{2}";
		System.out.println("19550101".matches(p21));
		System.out.println("1955-01-01".matches(p21));
		System.out.println("195501-01".matches(p21));
		
		// () : 그룹
		// | : or 또는
		
		String p22 = "(dog|cat)";  // dog 또는 cat 이면 true
		System.out.println("dog".matches(p22));
		System.out.println("cat".matches(p22));
		
		String p23 = "(\\d{4}|\\d{2}-?\\d{2}-?\\d{2})";
		System.out.println("19550101".matches(p23));
		System.out.println("550101".matches(p23));
		System.out.println("9550101".matches(p23)); // false
		System.out.println("1955-01-01".matches(p23));
		System.out.println("55-01-01".matches(p23));
		
		String p24 = ("(dog)+");
		System.out.println("dog".matches(p24));
		System.out.println("dogdog".matches(p24));
		System.out.println("dogdo".matches(p24));
		
		
		// \. : .(dog) 점 글자 자체
		String p25 = "\\.";
		System.out.println("a.".matches(p25)); // false
		System.out.println(".".matches(p25)); // true
		
		String p26 = "www\\.[a-z]+\\.com";
		System.out.println("www.daum.com".matches(p26));  // true
		System.out.println("daum.com".matches(p26));      // false  . 두개가 안들어감
		System.out.println("www.daumcom".matches(p26));   // false  . 두개가 안들어감
		
		
		
	}
}
