package library;

public  abstract class LibraryItem implements Borrowable{
	protected String itemId;
	protected String title;
	protected boolean Isavailable;
	protected int borrowLimit;
	
	public LibraryItem(String itemId, String title, int borrowLimit) {
		this.itemId=itemId;
		this.title=title;
		this.borrowLimit=borrowLimit;
		this.Isavailable=true;
	}
	
	public abstract  double calculatePenalty(int daysLate);

	@Override
	public String toString() {
		return "LibraryItem [itemId=" + itemId + ", title=" + title + ", available=" + Isavailable + ", borrowLimit="
				+ borrowLimit + "]";
	}

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public boolean isIsavailable() {
		return Isavailable;
	}

	public void setIsavailable(boolean isavailable) {
		Isavailable = isavailable;
	}

	public int getBorrowLimit() {
		return borrowLimit;
	}

	public void setBorrowLimit(int borrowLimit) {
		this.borrowLimit = borrowLimit;
	}
	
	
	
}
