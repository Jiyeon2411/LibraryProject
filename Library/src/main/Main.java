package main;

import java.util.*;
import java.time.*;
import library.Library;
import book.Book;
import library.Member;
import loan.LoanManager;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Main {
    private static Library incheonlib = Library.getInstance();
    private static LoanManager loanManager = new LoanManager();
    private static Scanner scanner = new Scanner(System.in);
	private static DateFormat df;
	private static Date date;

    public static void main(String[] args) {
        boolean run = true;

        Date date = new Date();
        SimpleDateFormat df = new SimpleDateFormat("MM/dd");
        
        
        while (run) {
            System.out.println("------------------------------------------------------------");
            System.out.println("1. 도서 등록 | 2. 회원 등록 | 3. 도서 대출 | 4. 도서 반납 | 5. 대출 조회");
            System.out.println("------------------------------------------------------------");
            System.out.print("선택> ");
            int num = scanner.nextInt();

            switch (num) {
                case 1:
                    registerBook();
                    break;
                case 2:
                    registerMember();
                    break;
                case 3:
                    borrowBook();
                    break;
                case 4:
                    returnBook();
                    break;
                case 5:
                    checkLoan();
                    break;
                default:
                    System.out.println("1~5 사이의 숫자를 입력해주세요.");
                    break;
            }
        }
    }

    private static void registerBook() {
        System.out.println("---------------");
        System.out.println("도서를 등록합니다");
        System.out.println("---------------");
        System.out.print("도서 제목: ");
        String title = scanner.next();
        System.out.print("도서 번호: ");
        int bookNum = scanner.nextInt();

        Book book = new Book(title, bookNum);
        incheonlib.addBook(book);

        System.out.println("도서가 등록되었습니다.");
    }

    private static void registerMember() {
        System.out.println("---------------");
        System.out.println("회원을 등록합니다");
        System.out.println("---------------");
        System.out.print("회원 이름: ");
        String name = scanner.next();
        System.out.print("회원 번호: ");
        int memberNum = scanner.nextInt();

        Member member = new Member(name, memberNum);
        incheonlib.addMember(member);

        System.out.println("회원이 등록되었습니다.");
    }

    private static void borrowBook() {
        System.out.println("---------------");
        System.out.println("도서를 대출합니다");
        System.out.println("---------------");
        System.out.print("회원 번호: ");
        int memberNum = scanner.nextInt();
        System.out.print("도서 제목: ");
        String title = scanner.next();

        Member member = findMemberByMemberNum(memberNum);
        if (member == null) {
            System.out.println("해당 회원은 존재하지 않습니다.");
            return;
        }

        Book book = findBookByTitle(title);
        if (book == null) {
            System.out.println("해당 도서는 존재하지 않습니다.");
            return;
        }

        incheonlib.borrowBook(book, member);
        
        System.out.println(df.format(date) + "도서가 대출되었습니다. 반납 기한은 ");
        
    }

    private static void returnBook() {
        System.out.println("---------------");
        System.out.println("도서를 반납합니다");
        System.out.println("---------------");
        System.out.print("도서 제목: ");
        String title = scanner.next();

        Book book = findBookByTitle(title);
        if (book == null) {
            System.out.println("해당 도서는 존재하지 않습니다.");
            return;
        }

        incheonlib.returnBook(book);
        System.out.println("도서가 반납되었습니다.");
    }

    private static void checkLoan() {
    	LoanManager loanManager = new LoanManager();
        loanManager.printLoanRecords();
    }

    private static Member findMemberByMemberNum(int memberNum) {
        for (Member member : incheonlib.getMemberList()) {
            if (member.getMemberNum() == memberNum) {
                return member;
            }
        }
        return null;
    }

    private static Book findBookByTitle(String title) {
        for (Book book : incheonlib.getBookList()) {
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        return null;
    }
}