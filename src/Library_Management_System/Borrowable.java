package Library_Management_System;

public interface Borrowable {
	void issueBook() throws BookNotAvailableException;
	void returnBook() throws InvalidReturnException;

}
