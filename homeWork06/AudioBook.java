
public class AudioBook extends Book
{
   private int minutes;
   private int seconds;
   
   public AudioBook (String title, Writer author, int minutes, int seconds, Publisher publisher, int yearOfPublication){
       super(title, author,publisher,yearOfPublication);
       this.minutes= minutes;
       this.seconds=seconds;
   }
   public int getMinutes(){
       return minutes;
   }
   public void setMinutes(){
       this.minutes=minutes;
   }
   public int getSeconds(){
       return seconds;
   }
   public void setSeconds(){
       this.seconds= seconds;
   }
   public String display(){
        return "Title: " + getTitle()+ " Author: " + getAuthorFirstName()+ " Minutes: "+getMinutes()+ " Seconds : " + getSeconds()+ " Publisher: "+getPublisherName()+ " Year Of Publication: "+getYearOfPublication();
    }
    public static void main (String [] args){
       
   }
}
