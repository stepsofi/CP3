import java.util.Random;
import java.util.Scanner;
public class StudentGrades {

    String studentName;
    double[] grades;
    int numberOfGrades;
    

    StudentGrades(String name) {
        this.studentName = name;
        this.grades = grades;
        this.numberOfGrades=(int) ((Math.random()*(10-1))+1);
        this.grades=new double [numberOfGrades];
        Scanner scan = new Scanner (System.in);
        System.out.println("Provide Grades: ");
        for (int i=0; i<numberOfGrades; i++){
            this.grades[i] = Double.parseDouble(scan.nextLine());
        }
        
    }
    double ClacLowestGrade(){
        double lGrade=grades[0];
        for (int i=0;i<grades.length;i++){
            if (grades[i]<lGrade){
                lGrade=grades[i];
            }
        }
        return lGrade;
    }
    double ClacHighestGrade(){
        double hGrade=grades[0];
        for (int i=0;i<grades.length;i++){
            if (grades[i]>hGrade){
                hGrade=grades[i];
            }
        }
        return hGrade;
    }
    int number(){
        return grades.length;
    }
    double averagePoint(){
        double sum = 0;
        for (int i=0;i<grades.length;i++){
            sum+=grades[i];
            }
        return sum/grades.length;
        }
    void display(){
        System.out.println("Name: " + studentName);
        System.out.println("Highest grade: " + ClacHighestGrade());
        System.out.println("Lowest grade : " + ClacLowestGrade());
        System.out.println("Number of grades: " + number());
        System.out.println("Avarege Grade: " + averagePoint());
        
    }
    public static void main(String[] args) {
    StudentGrades student1 = new StudentGrades("Amanda");
    student1.display();
    StudentGrades student2 = new StudentGrades("James");
    student2.display();
}
}

