
public class Writer
{
    private String name;
    private String surname; 
    private int yearOfBirth;
    private boolean isAlive;
    private int numberOfBooks;
    
    Writer (String name, String surname, int year, boolean isAlive, int books){
        this.name = name;
        this.surname = surname;
        this.yearOfBirth= year;
        this.isAlive = isAlive;
        this.numberOfBooks = books;
    }
    
    public String getName(){
        return name;
    }
    public String getSurname (){
        return surname;
    }
    public String toString(){
        return "Name: " + getName() + "Surname" + getSurname();
    }
}
