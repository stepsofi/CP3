

public class File
{
    private String name;
    private String dateOfCreation;
    private String extension;
    
    File (String name, String dateOfCreation, String extension){
        this.name=name;
        this.dateOfCreation=dateOfCreation;
        this.extension=extension;
    }
    
    public String getName(){
        return this.name;
    }
}
