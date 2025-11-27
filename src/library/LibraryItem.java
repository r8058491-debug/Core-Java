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
	
	protected abstract String getItemId();
	protected abstract String getTitle();
	protected abstract Boolean getIsAvailable();
	protected abstract Integer getBorrowLimit();
	
}
