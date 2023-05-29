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
			int selectNo = scanner.nextInt();
		}
	}

}
