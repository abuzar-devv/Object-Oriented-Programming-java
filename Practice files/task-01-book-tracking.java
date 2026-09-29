//A library app tracks books. Build the first piece:
//
//A class Book with two fields: title (String), pages (int).
//One method describe() that prints the title and pages on two lines.
//A main that creates one Book, sets its title to "Clean Code" and pages to 464, then calls describe().

public class Book {

    String title;
    int pages;

    void describe(){
        System.out.println("Book :"+title);
        System.out.println(("Pages:"+pages));
    }

    public static void main(String[] args) {
        Book b1=new Book();
        b1.title="Clean code";
        b1.pages=464;
        b1.describe();

    }
}
