package ch05.book.exercise;

public class Exercise07 {
	public static void main(String[] args) {
				int max = Integer.MIN_VALUE;
				int[]array = {-1,-5,-3,-8,-2};
					
				//	작성위치
					
				for(int i = 0; i < array.length; i++) {
					if(max < array[i]){
					max = array[i];
					}
	
				}
				System.out.println("max : "+ max);
				
				int min = Integer.MAX_VALUE;
				
				for(int i = 0; i < array.length; i++) {
					if(min > array[i]){
						min = array[i];
					}
	
				}
				System.out.println("min : "+ min);  
		
		                      										
	}
}
