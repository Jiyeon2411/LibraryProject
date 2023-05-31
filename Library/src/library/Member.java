package library;

import java.util.ArrayList;

public class Member {
	String name;
	int memberNum;
	ArrayList<Member> memberList = new ArrayList<Member>();
	
	public Member(String name, int memberNum) {
		this.name = name;
		this.memberNum = memberNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMemberNum() {
		return memberNum;
	}

	public void setMemberNum(int memberNum) {
		this.memberNum = memberNum;
	}
	
	
}
