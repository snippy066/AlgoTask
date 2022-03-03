import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class thirdAlpha {
    static List<String> li=new ArrayList<>();
        static String maxFreq(String []arr, int n)
        {
            // using moore's voting algorithm
            int res = 0;
            int count = 1,j=2;
            for(int i = 1; i < n; i++) {
                if(arr[i].equals(arr[res])) {
                    count++;
                } else {
                    count--;
                }
                if(j==i){
                    li.add(arr[i]);
                    j+=3;
                }
                if(count == 0) {
                    res = i;
                    count = 1;
                }
            }

            return arr[res];
        }

        public static void main (String[] args) {
            Scanner sc=new Scanner(System.in);
            String s[]=sc.nextLine().split("");
            int n = s.length;
            String freq = maxFreq(s, n);
            System.out.println(li);
            System.out.println("Maximum recurring character: "+freq);
        }

}
