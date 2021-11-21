

public class statistics
{
    static int numberOfItem(int x, int y){
        return y-x+1;
    }
    static int sum(int x, int y){
        int sum=0;
        for (int i=x; i<=y; i++){
            sum+=i;
        }
        return sum;
    }
    static double mean(int x, int y){
        int sum=0;
        for (int i=x; i<=y; i++){
            sum+=i;
        }
        return (sum/(y-x+1));
    }
    public static void main(String[] args){
    System.out.println(numberOfItem(5, 10));
    System.out.println(sum(5, 10));
    System.out.println(mean(5, 10));

}
}
