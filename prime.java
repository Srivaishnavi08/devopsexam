//this is sample java code
public class prime{
    public static boolean isPrime(int n)
    {
        for(int i=2;i<(n/2);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        for(int i=2;i<=100;i++)
        {
            if(isPrime(i))
                System.out.println(i);
        }
        
    }
}
//this is end of program
