import java.util.Scanner;

public class numberOfSquares {
    public static void main(String ar[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        while(n>0){
            int s=(int)Math.sqrt(n);
            n=n-s*s;
            count++;
        }
        System.out.println(count);
    }
}
