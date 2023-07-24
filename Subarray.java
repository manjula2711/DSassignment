import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Subarray {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         Scanner s = new Scanner(System.in);
        int in=s.nextInt();
        int arr[]=new int[in];
        int sum=0;
        int c=0;
        for (int i=0;i<in;i++){
            arr[i]=s.nextInt();
        }
        for (int i=0;i<in;i++){
            for (int j=i;j<in;j++){
                for (int k=i;k<=j;k++){
                    sum = sum+arr[k];           
                }    
                if(sum<0){
                    c++;
                }
                sum=0;
            }
        }
        System.out.print(c);
    }
}
