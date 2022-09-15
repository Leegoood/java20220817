package ch15.book.exercise.p08;
// Q. hashCode() 와 equals() 메소드의 내용을 채워라.
// A. Source의 Generate hashCode() and equals() 클릭

public class Student {
	public int studentNum;
	public String name;
	
	public Student ( int studentNum, String name) {
		this.studentNum = studentNum;
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + studentNum;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (studentNum != other.studentNum)
			return false;
		return true;
	}
	
}
