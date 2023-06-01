package library;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import book.Book;

public class Library {
    private static Library instance = new Library();
    private static String LIBRARY_NAME = "Incheon Library";
    private ArrayList<Book> bookList;
    private ArrayList<Member> memberList;
    private Map<Book, Member> loanRecords;

    private Library() {
        bookList = new ArrayList<>();
        memberList = new ArrayList<>();
        loanRecords = new HashMap<>();
    }

    public static Library getInstance() {
        return instance;
    }

    public void addBook(Book book) {
        bookList.add(book);
    }

    public void addMember(Member member) {
        memberList.add(member);
    }

    public void borrowBook(Book book, Member member) {
        loanRecords.put(book, member);
        System.out.println(member.getName() + "님이 " + book.getTitle() + "을(를) 대출했습니다.");
    }
    
    public List<Book> getBookList() {
        return bookList;
    }

    public List<Member> getMemberList() {
        return memberList;
    }

    public void returnBook(Book book) {
        Member member = loanRecords.remove(book);
        if (member != null) {
            System.out.println(member.getName() + "님이 " + book.getTitle() + "을(를) 반납했습니다.");
        } else {
            System.out.println("해당 도서는 대출 중이 아닙니다.");
        }
    }

}