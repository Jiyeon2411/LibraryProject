package Main;

import java.util.Scanner;

public class Main {

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
				createAccount();
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

	private static void createAccount() {
		
	}

	private static void checkLoan() {
		
	}

	private static void searchBooks() {
		
	}

	private static void loan() {

	}

}
