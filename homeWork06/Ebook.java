
public class Ebook extends Book
{
   private String fileName;
   
   public Ebook (String title, Writer author, String fileName, Publisher publisher, int yearOfPublication){
       super(title, author,publisher,yearOfPublication);
       this.fileName = fileName;
   }
   public String getFileName(){
       return fileName;
   }
   public void setFileName(String fileName){
       this.fileName = fileName;
    }
   public String display(){
        return "Title: " + getTitle()+ " Author: " + getAuthorFirstName()+ " File name: " + getFileName()+ " Publisher: "+getPublisherName()+ " Year Of Publication: "+getYearOfPublication();
    }
   public static void main (String [] args){
       
   }
}
