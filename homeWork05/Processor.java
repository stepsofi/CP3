
public class Processor
{
    private String producer;
    private double cPowerInGhz;
    private int numOfCores;
    private int yearOfRelease;
    
    Processor (String producer, double cPowerInGhz, int numOfCores, int yearOfRelease){
        this.producer = producer;
        this.cPowerInGhz=cPowerInGhz;
        this.numOfCores=numOfCores;
        this.yearOfRelease=yearOfRelease;
    }
    
    public String getProducer(){
        return this.producer;
    }
    public int getYearOfRelease(){
        return this.yearOfRelease;
    }
}
