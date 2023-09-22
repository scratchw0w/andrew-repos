import com.bosiy.Book;
import com.bosiy.Reader;

public class MainApplication {
    public static void main(String[] args) {

        Book random = new Book("The Adventures of Tom Sawyer", "M.Twain");
        Reader person = new Reader("Bosiy A.A", 15, "CS",
                "21.12.96", 0733186521d);
        person.takeBook(new Book[]{random, random});
        person.returnBook(new Book[]{random,random,random});
    }
}
