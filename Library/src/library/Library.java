package library;

import java.util.*;

import book.Book;

public class Library {
	//library 객체 생성
	private static Library instance = new Library();
	
	private static String LIBRARY_NAME = "Incheon Library";
	ArrayList<Book> bookList = new ArrayList<>();
	ArrayList<Member> memberList = new ArrayList<>();
	
	private Library() {}
	
	public static Library getInstance() {
		if (instance == null) {
			instance = new Library();
		}
		return instance;
	}
	
	//회원 등록
	public void addMember(Member member) {
		memberList.add(member);
	}
	
	//회원 리스트
	public ArrayList<Member> getMemberList() {
		return memberList;
	}
	
	public void addBook(Book book) {
		bookList.add(book);
	}
	
	//회원 리스트
	public ArrayList<Book> getBookList() {
		return bookList;
	}
}
