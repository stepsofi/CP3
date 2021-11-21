
public class Lamp{
    boolean isLampOn;
    
    void switchOn(){
        isLampOn= true;
    }
    void switchOff(){
        isLampOn= false;
    }
    void showStatus(){
        System.out.print("Is lamp on: " + isLampOn);
    }
}

