package iterator;

public class BookShelf implements Aggregate{
	private int size;
	private Book[] books;
	
	public BookShelf(int capacity){
		this.books = new Book[capacity];
	}
 
	public void appendBook(Book book){
		this.books[size] = book;
		size++;
	}

	public Iterator iterator(){
		return new BookShelfIterator(this);
	};

	public Iterator reverseiterator(){
		return new ReverseIterator(this);
	}

	public Book getBookAt(int index){
		return books[index];
	}

	public int getLength(){
		return size;
	}
}
