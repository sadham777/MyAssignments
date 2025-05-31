package week2.day1;

public class LibraryManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Library newbook = new Library();
       String oneMoreAddedBook = newbook.addBook("Sucess Story");
       System.out.println(oneMoreAddedBook);
       newbook.issuebook();
	}

}
