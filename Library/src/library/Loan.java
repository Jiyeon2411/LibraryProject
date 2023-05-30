package library;

public class Loan {
	String loanDate;
	String dueDate;
	Book borrowedBook;
	Member member;
	
	public Loan(String loanDate, String dueDate, Book borrowedBook, Member member) {
		this.loanDate = loanDate;
		this.dueDate = dueDate;
		this.borrowedBook = borrowedBook;
		this.member = member;
	}

	public String getLoanDate() {
		return loanDate;
	}

	public void setLoanDate(String loanDate) {
		this.loanDate = loanDate;
	}

	public String getDueDate() {
		return dueDate;
	}

	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}

	public Book getBorrowedBook() {
		return borrowedBook;
	}

	public void setBorrowedBook(Book borrowedBook) {
		this.borrowedBook = borrowedBook;
	}

	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}
	
}
