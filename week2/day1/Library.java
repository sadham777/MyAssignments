package week2.day1;

public class Library {
	
	public String addBook(String bookTitle) {
		System.out.println("Book added successfully");
        return bookTitle;
	}
	public void issuebook() {
		System.out.println("Book issued successfully");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Library bookStatus=new Library();
     String addedbook = bookStatus.addBook("TheSecret");
     System.out.println(addedbook);
     bookStatus.issuebook();
	}

}
