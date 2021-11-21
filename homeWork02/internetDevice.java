public class InternetDevice
{
    String name;
    boolean connected=false;
    static int connectedDevices=0;
    
    void connect(){
        connected = true;
        connectedDevices+=1;
    }
    void disconnected(){
        connected= false;
    }
    void isConnected(){
        System.out.println("Status /n is connected: " + connected);
    }
    static void displayConnections (){
        System.out.println(connectedDevices);
    }
    void displayStatus(){
        System.out.print(name);
        if (connected == true){
            System.out.println("Status: connected");}
        else{
            System.out.println("Status: disconnected");
        }
    }
    InternetDevice(String name){
        this.name = name;
    }
    public static void main(String[] args) {
        InternetDevice device1=new InternetDevice("Phone");
        device1.connect();
        device1.displayStatus();
        InternetDevice device2=new InternetDevice("Laptop");
        device2.connect();
        device2.displayStatus();
        InternetDevice device3=new InternetDevice("Computer");
        device3.connect();
        device3.displayStatus();
        InternetDevice device4=new InternetDevice("Tablet");
        device4.displayStatus();
        InternetDevice device5=new InternetDevice("TV");
        device5.displayStatus();
        System.out.println(connectedDevices);
    }
    
}
