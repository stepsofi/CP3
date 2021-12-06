

public class Book
{
    private String title;
    private Writer author;
    private Publisher publisher;
    private int yearOfPublication;
    
    Book (String title, Writer author, Publisher publisher,int yearOfPublication){
        this.title = title;
        this.author=author;
        this.publisher=publisher;
        this.yearOfPublication=yearOfPublication;
    }
    public String getTitle (){
        return title;
    }
    public String getAuthorFirstName(){
        return author.getFirstName();
    }
    public int getYearOfPublication(){
        return yearOfPublication;
    }
    public String getPublisherName(){
        return publisher.getName();
    }
    public void setTitle(String title){
        this.title = title;
    }
    public void setYearOfPublication(int yearOfPublication){
        this.yearOfPublication = yearOfPublication;
    }
    public void setAuthor(String author){
        this.author.setFirstName(author);
    }
    public String display(){
        return "Title: " + title+ " Author: " + getAuthorFirstName() + " Publisher: "+getPublisherName()+ " Year Of Publication: "+yearOfPublication;
    }

}
