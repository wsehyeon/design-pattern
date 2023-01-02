package week2.iterator.subject.BookShelf;

import java.util.Iterator;

public class Main {
	public static void main(String[] args) {
		BookShelf bookShelf = new BookShelf(4);
			 bookShelf.appendBook(new Book("Around the World in 80 Days"));
			 bookShelf.appendBook(new Book("Bible"));
			 bookShelf.appendBook(new Book("Cinderella"));
			 bookShelf.appendBook(new Book("Daddy-Long-Legs"));
			 Iterator it = bookShelf.iterator();
			 Iterator rit = bookShelf.reverseiterator();
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
