package ch15.book.exercise.p10;

import java.util.TreeSet;

public class TreeSetExample {
	public static void main(String[] args) {
		TreeSet<Student> treeSet = new TreeSet<Student>();
		Student s1 = new Student("blue", 96);
		Student s2 = new Student("red", 96);
		System.out.println(s1);
		
		treeSet.add(new Student("blue", 96));
		treeSet.add(new Student("hong", 86));
		treeSet.add(new Student("white", 92));
		treeSet.add(new Student("red", 96));
		System.out.println(s2);
		
		System.out.println(treeSet.size());
		System.out.println();
		
		Student student = treeSet.last();
		System.out.println("최고점수 : " + student.score);
		System.out.println("최고점수를 받은 아이디 : " + student.id);
	}
}
