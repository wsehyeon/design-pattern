package iterator.factory;

public class IteratorFactory extends Factory{
    @Override
    public Iterator createProduct(BookShelf list, int type){
      Iterator iterator = null;
			if (type == 1){
				iterator = new BookShelfIterator(list);
			}
			else{
				iterator = new ReverseIterator(list);
			}
			return iterator;
    }
}