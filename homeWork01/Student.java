
public class Student
{
    String imie; 
    String nazwisko;
    int wiek;
    String studentId;
    int semesterNumber;
    float avaregeGrade;
    boolean isIdCardValid;
    
    
    void sayHello(){
        System.out.println("Hello everyone!");
    };
    void displayName(){
        System.out.println(imie);
    };
    void mdisplayAge(){
        System.out.println(wiek);
    };
    void displayInfo(){
        System.out.println(imie +" " + semesterNumber + " " + avaregeGrade);
    };
    void zmien(){
        isIdCardValid = !isIdCardValid;
    }
    void displayNameAndIdCard(){
        System.out.println(imie+ " " + isIdCardValid + " " + studentId);
    }
    
}
