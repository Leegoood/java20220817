package ch15.book.s1505;

import java.util.TreeSet;

public class TreeSetExample {
	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet<Integer>();
		scores.add(new Integer(87));
		scores.add(new Integer(98));
		scores.add(new Integer(75));
		scores.add(new Integer(95));
		scores.add(new Integer(80));
//		scores.add(87); auto boxing
//		score.add(new Integer(98)); manual boxing		
		
		System.out.println(scores);  // 오름차순 출력 75,80,87,95,98
		System.out.println();
		
		Integer score = null;
		
		
		
		score = scores.first(); //  first : 제일 낮은 객체를 리턴
		System.out.println("가장 낮은 점수 : " + score);  
		
		score = scores.last();  // last : 제일 높은 객체를 리턴
		System.out.println("가장 높은 점수 : " + score + "\n");
		
		score = scores.lower(new Integer(95)); // lower : 주어진 객체보다 바로 아래 객체를 리턴
		System.out.println("95점 아래 점수 : " + score);
		
		score = scores.higher(new Integer(95)); // higher : 주어진 객체보다 바로 위 객체를 리턴
		System.out.println("95점 위의 점수 : " + score + "\n");
		
		score = scores.floor(new Integer(95)); // floor : 주어진 객체와 동등한 객체가 있으면 리턴, 만약 없다면 주어진 객체의 바로 아래의 객체를 리턴
		System.out.println("95점 이거나 바로 아래 점수 : " + score);
		
		score = scores.ceiling(new Integer(85)); // ceiling : 주어진 객체와 동등한 객체가 있으면 리턴, 만약 없다면 주어진 객체의 바로 위의 객체를 리턴 
		System.out.println("85점 이거나 바로 위의 점수 : " + score + "\n");
		
		while(!scores.isEmpty()) {
			score = scores.pollFirst(); // pollFirst : 제일 낮은 객체를 꺼내오고 컬렉션에서 제거함
										// pollLast : 제일 높은 객체를 꺼내오고 컬렉션에서 제거함
			System.out.println(score + "(남은 객체 수 : " + scores.size()+ ")");
		}
		
	}
}
