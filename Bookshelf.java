import java.util.ArrayList;

public class Bookshelf{
    
    public char FirstLetter;
    public ArrayList<Book> Books;
    int BookCount;

    public Bookshelf(){
        this.Books = new ArrayList<>();
        BookCount = 0;
    }

    public char getFirstLetter(){
        return FirstLetter;
    }

    public void setFirstLetter(char FirstLetter){
        this.FirstLetter = FirstLetter;
    }

    public ArrayList<Book> getBooks(){
        return Books;
    }

    public void setBooks(ArrayList<Book> Books){
        this.Books = Books;
    }

    public void addBook(Book book){
        if (book.Title().charAt(0) == FirstLetter && (Books.size() < 8)){
            Books.add(book);
        }
    }

    public void removeBook(Book book){
        Books.remove(book);
    }

    public String toString(){
        String result = "";
        for (int i = 0; i < Books.size(); i++){
            result += Books.get(i).Title();
            if (i < Books.size() - 1){
                result += "   ";
            }
        }
        
        if (Books.isEmpty()){
            return "";
        }
        
        return result;
    }
}
