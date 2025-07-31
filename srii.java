interface bookmark {
    public void display();
   
}

class book implements bookmark {
    String name;
    String author;

    book(String bookname, String authorname) {
        name = bookname;
        author = authorname;
        System.out.println("Book Name: " + name);
        System.out.println("Author Name: " + author);
    }

    book() {
        System.out.println("Default constructor");
    }

    book(int a) {
        System.out.println("Overloading constructor with int: " + a);
    }

    public void display() {
        System.out.println("Display method from abstract class implemented in book");
    }
}

public class srii {
    public static void main(String[] durgs) {
        
        book b = new book("Wings of Fire", "Kalam");
        book c = new book();
        book d = new book(6);
        d.display();
        
    }
}
