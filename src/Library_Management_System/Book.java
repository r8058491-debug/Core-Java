package Library_Management_System;

public abstract class Book {
	private String bookId;
	private String title;
	private String type;
	public Book(String bookId, String title, String type) {
		super();
		this.bookId = bookId;
		this.title = title;
		this.type = type;
	}
	public String getBookId() {
		return bookId;
	}
	public void setBookId(String bookId) {
		this.bookId = bookId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public abstract int getLoanDays();

}
