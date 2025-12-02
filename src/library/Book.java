package library;

public class Book extends LibraryItem {
	String bookName;
	public Book(String itemId, String title, String bookName, boolean Isavailable, int borrowLimit) {
		super(itemId,title,borrowLimit);
		this.bookName=bookName;
		this.Isavailable=true;
		
	}
	
	public double calculatePenalty(int daysLate) {
		return daysLate*100;
	}
	
	public void showDetails() {
		System.out.println("Book Id :"+itemId);
		System.out.println("Book Name :"+bookName);
		System.out.println("Book Title :"+title);
		System.out.println("Available :"+Isavailable);
		System.out.println("Borrow Limit :"+ borrowLimit);
		
	}

	public String getBookName() {
		return bookName;
	}

	public String getItemId() {
		return itemId;
		
	}
	public String getTitle() {
		return title;
	}
	
	public Boolean getIsAvailable() {
		return Isavailable;
	}
	public void setIsAvailable(boolean available) {
		this.Isavailable=available;
	}


	@Override
	public void borrow() {
		
		
	}

	@Override
	public void returnItem() {
		// TODO Auto-generated method stub
		
	}
	
}
