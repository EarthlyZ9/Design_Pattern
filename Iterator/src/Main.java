/*
    요구사항
    - 책을 등록하고 순회하면서 등록한 책 목록을 출력
    - 자바 Iterator 라이브러리를 사용하지 말 것
 */

public class Main {
    public static void main(String[] args) {
        BookShelfAggregate bookShelfAggregate = new BookShelfAggregate(3);

        bookShelfAggregate.appendBook(new Book("어린 왕자"));
        bookShelfAggregate.appendBook(new Book("작은 아씨들"));
        bookShelfAggregate.appendBook(new Book("제인 에어"));

        System.out.println("개수: " + bookShelfAggregate.getLength());

        Iterator iterator = bookShelfAggregate.CreateIterator();

        while(iterator.hasNext()) {
            Book book = (Book) iterator.next();
            System.out.println(book.getName());
        }

    }
}