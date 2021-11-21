

public class Product
{
    private String productName;
    private boolean isVegeterian;
    
    String getProductName(){
        return this.productName;
    }
    void setProductName(String name){
        this.productName = name;
    }
    boolean getIsVegeterian(){
        return isVegeterian;
    }
    void setIsVegeterian(boolean isVegeterian){
        this.isVegeterian = isVegeterian;
    }
    
    public static void main (String[] args){
    Product product1 = new Product();
    product1.setProductName("melone");
    product1.setIsVegeterian(true);
    System.out.println(product1.getProductName());
    System.out.println(product1.getIsVegeterian());
    }
}