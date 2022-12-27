package iterator.factory.swang;

import iterator.factory.Aggregate;
import iterator.factory.Iterator;

public class LinkedListIterator implements Iterator {
	private Aggregate myAggregate;
	private int curr;
	private boolean reverse;

	public LinkedListIterator(Aggregate list, int type){
		myAggregate = list;
		if (type == 0){
			curr = 0;
			reverse = false;
		}
		else{
			curr = list.getLength();
			reverse = true;
		}
	}
	
	public boolean hasNext(){
		if (reverse){
			if (curr > 0)
				return true;
			else
				return false;
		}
		if (curr < myAggregate.getLength())
			return true;
		return false;
	};


	public Object next(){
		if(reverse){
			curr--;
			return	myAggregate.atObject(curr);
		}
		else{
			Object obj = myAggregate.atObject(curr);
			curr++;
			return obj;
		}
	};
}
