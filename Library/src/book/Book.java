package book;

public class Book {
    private String title;
    private int bookNum;

    public Book(String title, int bookNum) {
        this.title = title;
        this.bookNum = bookNum;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
		this.title = title;
	}

    public int getBookNum() {
        return bookNum;
    }
    
	public void setBookNum(int bookNum) {
		this.bookNum = bookNum;
	}

	
}