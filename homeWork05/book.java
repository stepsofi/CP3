import java.util.ArrayList;

public class Book
{
    private String title;
    private int yearOfRelease;
    private Writer author;
    private int pages;
    private String publisher;
    private ArrayList<Chapter> chapters = new ArrayList<Chapter>();
    
    Book(String title, int year, Writer author, int pages, String publisher){
        this.title = title;
        this.yearOfRelease=year;
        this.author = author;
        this.pages= pages;
        this.publisher=publisher;
    }
    
    public String getTitle(){
        return title;
    }
    public void setPublisher(String publisher){
        this.publisher = publisher;
    }
    public String toString(){
        return "Title: " + title + " Year of release: " + yearOfRelease;
    }
    public void addChapter(String title,int numOfPages, int startPage){
        chapters.add(new Chapter(title,numOfPages, startPage));
    }
    public void showChapters(){
        for (int i=0; i< chapters.size();i++){
            System.out.println((chapters.get(i)).getTitle());
        }
    }
}
