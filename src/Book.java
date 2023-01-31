public abstract class Book {
    private String BookAutor;
    private String BookName;
    private String BookLang;

    public void setBookAutor(String bookAutor){
        this.BookAutor = bookAutor;
    }
    public void setBookName(String bookName){
        this.BookName = bookName;
    }
    public void setBookLang(String bookLang){
        this.BookLang = bookLang;
    }

    public String getBookAutor(){
        return BookAutor;
    }
    public String getBookName(){
        return BookName;
    }
    public String getBookLang(){
        return BookLang;
    }

}
