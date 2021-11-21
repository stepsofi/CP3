public class bankAccount
{
    int balance;
    String dateOfCreation;
    String dateOfLastOperation;
    String currency;
    String owner;
    
    void showDates(){
        System.out.print("Date of creation: " + dateOfCreation);
        System.out.print("Date of last operation: " + dateOfCreation);
    }
    void showBalance(){
        System.out.print("Balance:  " + balance + currency);
    }
    void showOwner(){
        System.out.print(owner);
    }
}
