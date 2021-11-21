

public class Student
{
    private String name;
    private String idNumber;
    private int age;
    
    Student (String name, String idNumber, int age){
        this.name = name;
        this.idNumber = idNumber;
        this.age = age;
    }
    public static void main(String[] args){
        Student student1 = new Student("Sofi", "734823", 18);
        System.out.println(student1.name);
    }
}


