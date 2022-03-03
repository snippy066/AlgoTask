import java.util.Scanner;

public class unrepeatedElement {
        public static void search(int[] arr, int low, int high)
        {
            if (low > high)
                return;
            if (low == high) {
                System.out.println(arr[low]);
                return;
            }

            // Find the middle point
            int mid = (low + high) / 2;
            if (mid % 2 == 0) {
                if (arr[mid] == arr[mid + 1])
                    search(arr, mid + 2, high);
                else
                    search(arr, low, mid);
            }
            // If mid is odd
            else if (mid % 2 == 1) {
                if (arr[mid] == arr[mid - 1])
                    search(arr, mid + 1, high);
                else
                    search(arr, low, mid - 1);
            }
        }

        public static void main(String[] args)
        {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++) arr[i]=sc.nextInt();
            search(arr, 0, n - 1);
        }

}
