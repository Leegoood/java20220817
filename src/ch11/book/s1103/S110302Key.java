package ch11.book.s1103;

public class S110302Key {
	public int number;
	
	public S110302Key(int number) {
		this.number = number;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + number;
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
		S110302Key other = (S110302Key) obj;
		if (number != other.number)
			return false;
		return true;
	}
	
	
}
