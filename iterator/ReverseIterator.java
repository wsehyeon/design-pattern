package iterator;

import java.util.NoSuchElementException;

public class ReverseIterator implements Iterator{
	private BookShelf bookShelf;
	private int current;

	public ReverseIterator(BookShelf bookshelf){
		this.bookShelf = bookshelf;
		this.current = bookshelf.getLength();
	}
	
	public boolean hasNext(){
		if (current > 0)
			return true;
		else
			return false;
	}

	public Book next(){
		if (!hasNext())
			throw new NoSuchElementException();
		current--;
		Book book = bookShelf.getBookAt(current);
		return book;
	}

}
