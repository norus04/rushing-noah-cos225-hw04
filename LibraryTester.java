public class LibraryTester{
    public static void main(String[] args){
        
        Bookshelf shelf_O = new Bookshelf();
        Bookshelf shelf_T = new Bookshelf();
        shelf_O.setFirstLetter('O');
        shelf_T.setFirstLetter('T');

        System.out.println(shelf_O);
        System.out.println(shelf_T);

        Book book_1 = new Book("The Heart of the Betrayed", "Crime");
        Book book_2 = new Book("Our Hill of Stars", "Fantasy");
        Book book_3 = new Book("One of a Kind", "Science Fiction");
        Book book_4 = new Book("The Vision of Roses", "Romance");

        System.out.println(book_1);
        System.out.println(book_2);
        System.out.println(book_3);
        System.out.println(book_4);

        shelf_O.addBook(book_1);
        shelf_O.addBook(book_2);
        shelf_O.addBook(book_3);
        shelf_O.addBook(book_4);

        shelf_T.addBook(book_1);
        shelf_T.addBook(book_2);
        shelf_T.addBook(book_3);
        shelf_T.addBook(book_4);

        System.out.println(shelf_O);
        System.out.println(shelf_T);
    }
    
}
