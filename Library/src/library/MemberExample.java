package library;

import library.*;

public class MemberExample {
	Library incheonlib = Library.getInstance();
	
	public static void main(String[] args) {
		MemberExample info = new MemberExample();
		
		info.createMember();
	
	}

	private void createMember() {
		Member mem1 = new Member("전영중", 1);
		Member mem2 = new Member("박병찬", 2);
		Member mem3 = new Member("최종수", 3);
		Member mem4 = new Member("윤정한", 4);
		Member mem5 = new Member("홍지수", 5);
		
		incheonlib.addMember(mem1);
		incheonlib.addMember(mem2);
		incheonlib.addMember(mem3);
		incheonlib.addMember(mem4);
		incheonlib.addMember(mem5);
	}
}
