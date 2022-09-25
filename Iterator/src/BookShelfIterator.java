public class BookShelfIterator implements Iterator{
    private final BookShelfAggregate bookShelfAggregate;
    private int index;

    public BookShelfIterator(BookShelfAggregate bookShelfAggregate) {
        this.bookShelfAggregate = bookShelfAggregate;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < bookShelfAggregate.getLength();
    }

    @Override
    public Object next() {
        Book book = bookShelfAggregate.getBookAt(index);
        index++;
        return book;
    }
}
