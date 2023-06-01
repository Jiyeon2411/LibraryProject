package loan;

import java.util.ArrayList;
import java.util.List;

public class LoanManager {
    private List<Loan> loanRecords;

    public LoanManager() {
        loanRecords = new ArrayList<>();
    }

    public void addLoanRecord(Loan record) {
        loanRecords.add(record);
    }

    public List<Loan> getLoanRecords() {
        return loanRecords;
    }

    public void printLoanRecords() {
        for (Loan record : loanRecords) {
            System.out.println("대출일: " + record.getLoanDate());
            System.out.println("반납일: " + record.getDueDate());
            System.out.println("대출 도서: " + record.getBorrowedBook().getTitle());
            System.out.println("대출 회원: " + record.getMember().getName());
            System.out.println("-------------------------");
        }
    }
}