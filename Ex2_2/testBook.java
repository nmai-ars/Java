package Ex2_2;

public class testBook {
	public static void main(String[] args) {
        Author[] authors = new Author[2];
        authors[0] = new Author("NMai", "nmai@gmail.com", 'f');
        authors[1] = new Author("VTruong", "vtuong@gmail.com", 'm');

        Book javaDummy = new Book("Java", authors, 19.99, 99);

        System.out.println(javaDummy);

    }
}
