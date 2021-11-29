

public class Computer
{
    private boolean dgpu;
    private String os;
    private int YearOfAssembly;
    private String typeOfMemory;
    private boolean isLaptop;
    private int ram;
    private Processor processor;
    
    Computer(boolean dgpu, String os, int YearOfAssembly, String typeOfMemory, boolean isLaptop, int ram){
        this.dgpu=dgpu;
        this.os=os;
        this.YearOfAssembly=YearOfAssembly;
        this.typeOfMemory=typeOfMemory;
        this.isLaptop=isLaptop;
        this.ram=ram;
        this.processor=new Processor("AMD", 3.4, 16, 2020);
    }
    
    public String getOs(){
        return os;
    }
    public String getProcessorProducer(){
        return processor.getProducer();
    }
    
    public static void main (String[] args){
        Computer c1= new Computer(true, "Windows",2020, "HDD", false, 32);
        System.out.println(c1.getProcessorProducer());
    }
}
