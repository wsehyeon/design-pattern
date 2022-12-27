package iterator.factory.swang;

import iterator.factory.Aggregate;
import iterator.factory.Factory;
import iterator.factory.Iterator;

public class LinkedListFactory extends Factory{
	protected Iterator createProduct(Aggregate list, int type){
		Iterator iter = new LinkedListIterator(list,type);
		return iter;
	}
}