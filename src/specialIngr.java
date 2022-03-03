import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
/*
        input formate
        n=3
        abc
        dcd
        bcd
*/
public class specialIngr {
    public static void main(String ar[]){
        int[] arr=new int[26];
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),count=0,temp;
        temp=n;
        sc.nextLine();
        while(n-->0){
            String s=sc.nextLine();
            HashSet<Character> hs=new HashSet<>();

            for(int j=0;j<s.length();j++){
                hs.add(s.charAt(j));
            }

            for(Character c:hs){
                arr[c-97]++;
            }
        }

        for(int i=0;i<26;i++){
            if(arr[i]==temp) count++;
        }

        System.out.println(count);
    }
}
