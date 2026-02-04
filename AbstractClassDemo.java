import java.util.Scanner;

// Abstract class representing a Book
abstract class Book {
    protected String title;

    abstract void setTitle(String title);

    String getTitle() {
        return title;
    }
}

// Concrete implementation of Book
class MyBook extends Book {
    @Override
    void setTitle(String title) {
        this.title = title;
    }
}

public class AbstractClassDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userTitle = scanner.nextLine();

        MyBook novel = new MyBook();
        novel.setTitle(userTitle);

        System.out.println("The title is: " + novel.getTitle());
        scanner.close();
    }
}
