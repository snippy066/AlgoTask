import java.util.Scanner;

public class subArrMaxSum {
    static int maxSubArraySum(int a[],int size)
    {

        int max = a[0], prev_max = 0;

        for (int i = 0; i < size; i++)
        {
            prev_max = prev_max + a[i];
            if (prev_max < 0)
                prev_max = 0;

            else if (max < prev_max)
                max = prev_max;

        }
        return max;
    }
    public static void main(String ar[]){
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();

        int[] arr=new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();

        System.out.println(maxSubArraySum(arr,n));
    }

}
