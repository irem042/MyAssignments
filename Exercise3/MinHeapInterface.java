public interface MinHeapInterface<T extends Comparable<? super T>>
{
   /** Adds a new entry to this heap. */
   public void add(T newEntry);

   /** Removes and returns the smallest item in this heap. */
   public T removeMin();

   /** Retrieves the smallest item in this heap. */
   public T getMin();

   /** Detects whether this heap is empty. */
   public boolean isEmpty();

   /** Gets the size of this heap. */
   public int getSize();

   /** Removes all entries from this heap. */
   public void clear();
}

