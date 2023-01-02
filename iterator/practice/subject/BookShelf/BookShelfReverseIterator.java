package week2.iterator.subject.BookShelf;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class BookShelfReverseIterator implements Iterator<Book>{
	private BookShelf bookShelf;
	private int index;
	
	public BookShelfReverseIterator(BookShelf bookshelf){
		this.bookShelf = bookshelf;
		this.index = bookshelf.getLength();
	}

	@Override
	public boolean hasNext() {
		if (index > 0)
			return true;
		else
			return false;
	}

	@Override
	public Book next(){
		if(!hasNext())
			throw new NoSuchElementException();
		index--;
		Book book = bookShelf.getBookAt(index);
		return book;
	}

}