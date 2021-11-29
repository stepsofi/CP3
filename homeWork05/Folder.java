import java.util.ArrayList;

public class Folder
{
    private String name;
    private String dateOfCreation;
    private ArrayList<File> files = new ArrayList<File>();
    
    Folder (String name, String dateOfCreation){
        this.name = name;
        this.dateOfCreation=dateOfCreation;
    }
    public void addFile(String name){
        files.add(new File(name, "28-11-21", "docx"));
    }
    public void showContents(){
        for (int i=0; i< files.size();i++){
            System.out.println((files.get(i)).getName());
        }
    }
    public void removeFile(){
        files.remove(files.size()-1);
    }
    
    public static void main (String [] args){
        Folder folder1= new Folder("Folder1", "28-11-21");
        folder1.addFile("file1");
        folder1.addFile("file2");
        folder1.showContents();
        folder1.addFile("file3");
        folder1.showContents();
        folder1.removeFile();
        folder1.showContents();
    }
}
