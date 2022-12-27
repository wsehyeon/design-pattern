package iterator;

import java.util.NoSuchElementException;

public class BookShelfIterator implements Iterator{
	private BookShelf bookShelf;
	private int current;

	public BookShelfIterator(BookShelf bookshelf){
		this.bookShelf = bookshelf;
		this.current = 0;
	}
	
	public boolean hasNext(){
		if (current < bookShelf.getLength())
			return true;
		else
			return false;
	}

	public Book next(){
		if (!hasNext())
			throw new NoSuchElementException();
		Book book = bookShelf.getBookAt(current);
		current++;
		return book;
	}
}
