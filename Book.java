public class Book{
    
    public String Title;
    public String Genre;

    public Book(String Title, String Genre){
        this.Title = Title;
        this.Genre = Genre;
    }

    public String Title(){
        return Title;
    }

    public String toString(){
        return Title;
    }
}