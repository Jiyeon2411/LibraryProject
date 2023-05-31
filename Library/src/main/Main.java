package main;

import library.Library;
import library.Member;
import java.util.*;

public class Main {

	Library incheonlib = Library.getInstance();
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean run = true;
		
		while(run) {
			System.out.println("-----------------------------------------------------");
			System.out.println("1.도서 대출 | 2.도서 검색 | 3.대출 조회 | 4.회원 등록 | 5.종료");
			System.out.println("-----------------------------------------------------");
			System.out.println("선택> ");
			int num = scanner.nextInt();
			
			switch (num) {
			case 1:
				//대출
				loan();
				break;
			case 2:
				//검색
				searchBooks();
				break;
			case 3:
				//조회
				checkLoan();
				break;
			case 4:
				//회원 등록
				createMember();
				break;
			case 5:
				run = false;
				break;
			default:
				System.out.println("1~5사이의 숫자를 입력해주세요.");
				break;
			}
		}
	}
	private static void createMember() {
		System.out.println("---------------");
		System.out.println("회원등록을 진행합니다.");
		System.out.println("---------------");
		
		System.out.println("이름: ");
		String name = scanner.next(); 
		
		System.out.println("회원번호: ");
		int memberNum = scanner.nextInt();
		
		Member member = new Member(name, memberNum);
	}
	private static void checkLoan() {
		
	}
	private static void searchBooks() {
		
	}
	private static void loan() {
	}
}

