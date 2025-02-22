package Ex2_1;

public class TestBook {
	public static void main(String[] args) {
		Author nmai = new Author("Tran Thi Ngoc Mai", "maittn.24itb@vku.udn.vn", 'f');
		System.out.println(nmai);

		Book dummyBook = new Book("Java", nmai, 19.95, 99);
		System.out.println(dummyBook);  

		dummyBook.setPrice(29.95);
		dummyBook.setQty(28);
		System.out.println("name is: " + dummyBook.getName());
		System.out.println("price is: " + dummyBook.getPrice());
		System.out.println("qty is: " + dummyBook.getQty());
		System.out.println("Author is: " + dummyBook.getAuthor());  // Author's toString()
		System.out.println("Author's name is: " + dummyBook.getAuthor().getName());
		System.out.println("Author's email is: " + dummyBook.getAuthor().getEmail());

		Book anotherBook = new Book("more Java", 
		      new Author("Nguyen Van A", "Nguyenvana@gmail.com", 'm'), 29.95);
		System.out.println(anotherBook);  
	}
}
