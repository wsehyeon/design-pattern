package iterator.factory;

public abstract class Factory {  
	public final Iterator create(BookShelf list, int type) {
        Iterator p = createProduct(list, type);
        return p;
	}
  
	protected abstract Iterator createProduct(BookShelf list, int type);
}