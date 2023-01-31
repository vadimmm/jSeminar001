import java.util.ArrayList;
class LibraryBooks{
    public String bAutor;
    public String bName;
    public String bLang;
}
public class Library extends Book{
    public String LibraryName;
    public Library(String libraryName){
        this.LibraryName = libraryName;
    }
    ArrayList<LibraryBooks> listBook = new ArrayList<>();
    public void addBook(String bookAutor, String bookName, String bookLang){
        LibraryBooks lb = new LibraryBooks();
        setBookAutor(bookAutor);
        setBookName(bookName);
        setBookLang(bookLang);
        lb.bAutor = getBookAutor();
        lb.bName = getBookName();
        lb.bLang = getBookLang();
        listBook.add(lb);
    }
    public ArrayList<LibraryBooks> getBookList(){
        return listBook;
    }

}
