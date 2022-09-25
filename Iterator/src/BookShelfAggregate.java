public class BookShelfAggregate implements Aggregate{
    private final Book[] books;
    private int last = 0;

    public BookShelfAggregate(int maxSize) {
        this.books = new Book[maxSize];
    }

    public Book getBookAt(int index) {
        return books[index];
    }

    public void appendBook(Book book) {
        this.books[last] = book;
        last ++;
    }

    public int getLength() {
        return last;
    }

    @Override
    public Iterator CreateIterator() {
        return new BookShelfIterator(this);
    }
}
