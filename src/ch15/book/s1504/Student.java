package ch15.book.s1504;

public class Student {
	public int sno;
	public String name;
	
	public Student(int sno, String name) {
		this.sno = sno;
		this.name = name;
	}
		public boolean equals(Object obj) { // 학번과 이름이 동일할 경우 true를 리턴			
		if(obj instanceof Student) {	
			Student student = (Student) obj;
			return (sno == student.sno) && (name.equals(student.name));
		}else {
			return false;
		}
	}
	
	public int hashCode() {   // 학번과 이름이 같다면 동일한 값을 리턴
		return sno + name.hashCode();
	}
}

// public boolean equals(Object obj)	
// 변수랑 데이터가 같아도 false가 나오기 때문에
// true로 나오게 하기위해 equals를 재정의해준다.
// boolean은 매개값이 필요하다.
// 그래서 최상위 클래스인 Object를 매개타입 obj변수명으로 지정한다.
// Object obj와 형성할 자식 객체를 비교한다.
// if(obj instanceof Student) : instanceof 좌항(obj)는 객체, 우항(Student)은 타입
// Student 타입으로 obj 매개변수를 형변환
// 좌측obj 타입으로 변환된 객체가 Student인지 확인.
// 타입변환에서는 꼭 확인지 필요하다.			
// Student student = (Student) obj;			
// 강제타입변환 : 자식타입 타입명=(자식타입) 부모타입명
// 만약 Student로부터 obj객체가 만들어진게 맞다면 강제타입변환이 이루어진다.
// return (sno == student.sno) && (name.equals(student.name));
//	}else {
//	return false;
// Object obj가 Student 클래스로부터 만들어진
// 객체가 맞다면 true;,
// 멤버객체가 아니라면 false를 리턴하는 if 문이다.
// obj 객체가 Student로부터 만들어졌는지 보는 코드이다.