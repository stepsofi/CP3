import java.util.ArrayList;

public class Bookcase 
{
    private String name;
    private ArrayList<Book> books = new ArrayList<Book>();

    Bookcase (String name){
        this.name=name;
    }
    public void addBook(Book b){
        books.add(b);
    }
    public void showContents(){
        for (int i=0; i< books.size();i++){
            System.out.println((books.get(i)).getTitle());
        }
    }   
    public void removeBook(){
        books.remove(books.size()-1);
    }
    
    public static void main (String [] args){
        Bookcase b1 = new Bookcase("Bookcase1");
        Writer w1= new Writer ("Joane", "Rowling", 1965, true, 20);
        Book book1= new Book("Harry Potter", 2000, w1 ,300, "Bloomsbury" );
        b1.addBook(book1);
        b1.showContents();
        book1.addChapter("Chapter1",20,5);
        book1.showChapters();
    }
}
