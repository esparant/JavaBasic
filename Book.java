package class1.ex;

public class Book {
    String title;
    String author;
    int page;


    Book() {
        this("","",0);
    }
    Book(String title, String author, int page) {
        this.title = title;
        this.author = author;
        this.page = page;
    }

    Book(String title, String author) {
        this(title, author, 0);
    }

    void displayInfo() {
        System.out.printf("도서 제목: %s, 도서 저자: %s,페이지 수: %d\n", title, author, page);
    }


}
