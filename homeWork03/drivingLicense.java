

public class drivingLicense
{
   private String name;
   private String surname; 
   private String address;
   private String postalCode;
   private String licenseNumber;
   private int yearOfIssue;
   private String category;
   
   drivingLicense (String name, String surname, String address, String postalCode, String licenseNumber,int yearOfIssue,String category){
       this.name= name;
       this.surname= surname;
       this.address=address;
       this.postalCode=postalCode;
       this.licenseNumber=licenseNumber;
       this.yearOfIssue=yearOfIssue;
       this.category=category;
   }
   void displayInfo(){
       System.out.println(getName());
       System.out.println(getSurname());
       System.out.println(address);
       System.out.println(postalCode);
       System.out.println(licenseNumber);
       System.out.println(yearOfIssue);
       System.out.println(category);
   }
   
   public String getName(){
       return this.name;
   }
   public void setName(String name){
       this.name=name;
   }
   public String getSurname(){
       return this.surname;
   }
   public void setSurname(String surname){
       this.surname=surname;
   }
   public String getAddress(){
       return this.address;
   }
   public void setAddress(String address){
       this.address=address;
   }
   public String getPostalCode(){
       return this.postalCode;
   }
   public void setPostalCode(String postalCode){
       this.postalCode=postalCode;
   }
   public int getyearOfIssue(){
       return this.yearOfIssue;
   }
   public void setYearOfIssuee(int yearOfIssue){
       if (yearOfIssue<=2021 && yearOfIssue>=1980){
        this.yearOfIssue=yearOfIssue;
        }
   }
   public String getLicenseNumber(){
       return this.licenseNumber;
   }
   public void setLicenseNumber(String LicenseNumber){
       this.licenseNumber=licenseNumber;
   }
   public String getCategory(){
       return this.category;
   }
   public void setCategoty(String Categoty){
       this.category=category;
   }
   public String toString(){
       return ("Name: " + name + " Surname: " + surname + " Number of license: " + licenseNumber); 
   }
       
   public static void main (String[] args){
       drivingLicense license1= new drivingLicense("Sofi", "Stepanets", "Raclawicka 9", "30-075", "123456", 2022, "B");
       license1.displayInfo();
       System.out.println(license1);
   }
   
}
