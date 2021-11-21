

public class rectangles
{
    int lenght;
    int width;
    
    void showSize(){
        System.out.print(lenght + "x" + width);
    }
    void showPerimeter(){
        System.out.print("\nPerimeter: "+lenght*2+width*2);
    }
    void showArea(){
        System.out.print("\nArea: "+lenght*width);
    }
}
