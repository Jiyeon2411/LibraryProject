package library;

public class Member {
    private String name;
    private int memberNum;

    public Member(String name, int memberNum) {
        this.name = name;
        this.memberNum = memberNum;
    }

    public String getName() {
        return name;
    }

    public int getMemberNum() {
        return memberNum;
    }
}