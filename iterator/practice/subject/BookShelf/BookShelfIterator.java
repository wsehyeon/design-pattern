package week2.iterator.subject.BookShelf;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class BookShelfIterator implements Iterator<Book>{
	private BookShelf bookShelf;
	private int index;
	
	public BookShelfIterator(BookShelf bookshelf){
		this.bookShelf = bookshelf;
		this.index = 0;
	}

	@Override
	public boolean hasNext() {
		if (index < bookShelf.getLength())
			return true;
		else
			return false;
	}

	@Override
	public Book next(){
		if(!hasNext())
			throw new NoSuchElementException();
		Book book = bookShelf.getBookAt(index);
		index++;
		return book;
	}

}