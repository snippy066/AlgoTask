import java.util.*;
public class makeElementEqual {
        public static int minOperation (int arr[], int n,int k)
        {
            int count=0;
            Arrays.sort(arr);
            int max_element=arr[n-1];
            for(int i=0;i<n-1;i++){
                int temp=max_element-arr[i];
                if(temp%k==0) count+=temp/k;
                else{
                    count=-1;
                    break;
                }
            }

            return count;
        }

        public static void main(String[] args) {
           Scanner sc=new Scanner(System.in);
           int n=sc.nextInt();
           int[] arr=new int[n];
           for(int i=0;i<n;i++) arr[i]=sc.nextInt();
           int k=sc.nextInt();
            System.out.print(minOperation(arr, n,k));
        }

}
