package ch11.book.s1103;

public class S110302Member {
	public String id;
	
	public S110302Member(String id) {
		this.id = id;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member) obj;
			if(id.equals(member.id)) {
				return true;
			}
		}
		return false;
	}
	@Override                   // id가 동일한 문자열인 경우 같은 해시코드를 리턴
	public int hashCode() {
		return id.hashCode();
	}
}
