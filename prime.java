public class prime{
    public static void main(String[] args) {
        int n=9 ,c=0;
        for(int i=2;i<(n/2);i++){
            if(n%i==0){
                System.out.println(n+" It is not prime");
                c=1;
                break;
            }
        }
        if(c==0){
            System.out.println("It is a prime");
        }
    }
}