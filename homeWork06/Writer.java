

public class Writer
{
   private String firstName;
   private String lastName;
   private String literaryGenre;
   
   public Writer (String firstName, String lastName, String literary_genre){
       this.firstName=firstName;
       this.lastName=lastName;
       this.literaryGenre=literaryGenre;
   }
   public String getFirstName(){
       return firstName;
   }
   public String getLastName(){
       return lastName;
   }
   public void setFirstName(String firstName){
       this.firstName=firstName;
   }
   public void setLastName(String lastName){
       this.lastName=lastName;
   }
}
