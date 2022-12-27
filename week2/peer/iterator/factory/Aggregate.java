package iterator.factory;

public interface Aggregate {
	public abstract Iterator iterator();
	public abstract Iterator reverseiterator();
	public abstract int getLength();
	public abstract Book getBookAt(int index);
}
