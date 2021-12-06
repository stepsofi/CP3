import java.util.ArrayList;

public class Library
{
    private ArrayList<Book> books = new ArrayList<Book>();
    private String name;
    
    Library(String name){
        this.name = name;
    }
    public void addBook(Book b){
        books.add(b);
    }
    public void display(){
        for (int i=0; i<books.size();i++){
            System.out.println(books.get(i).display());
        }
    }
    
    public static void main (String [] args){
       Library l1= new Library("l1");
       Publisher p1= new Publisher ("Publisher1", "London");
       Writer w1= new Writer ("Joan", "Rowling", "fantasy");
       Book b1= new Book("Harry Potter", w1,p1,2000);
       Ebook e1= new Ebook("Harry Potter2", w1, "harryPotter.pdf",p1,2001);
       AudioBook a1= new AudioBook("Harry Potter3", w1, 240, 35,p1,2002);
       AudioBook a2= new AudioBook("Harry Potter4", w1, 320,45,p1,2003);
       l1.addBook(b1);
       l1.addBook(e1);
       l1.addBook(a1);
       l1.addBook(a2);
       l1.display();
   }
}
