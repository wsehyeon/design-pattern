package iterator.factory;

public class Main {
    public static final int Iterator = 1;
	public static final int ReverseIterator = 2;
	public static void main(String[] args) {

		
		Factory factory = new IteratorFactory();
		BookShelf bookShelf = new BookShelf(4);
		
		bookShelf.appendBook(new Book("Around the World in 80 Days"));
		bookShelf.appendBook(new Book("Bible"));
		bookShelf.appendBook(new Book("Cinderella"));
		bookShelf.appendBook(new Book("Daddy-Long-Legs"));
		
		Iterator it = factory.create(bookShelf, Iterator);
		Iterator rit =factory.create(bookShelf, ReverseIterator);
		
		while (it.hasNext()) {
			Book book = (Book)it.next();
			System.out.println("" + book.getName());
		}
		while (rit.hasNext()) {
			Book book = (Book)rit.next();
			System.out.println("" + book.getName());
		}
	}
}