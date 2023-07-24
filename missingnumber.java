import java.util.Scanner;
class missingnumber{
  public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("enter size of an array: ");
        int n=sc.nextInt();
        int[] arrNum=new int[n];
        System.out.print("enter array elements:");
        for(int i=0;i<n;i++){
            arrNum[i]=sc.nextInt();
        }
        for(int i=0;i<n-1;i++){
            int difference=arrNum[i+1]-arrNum[i];
            if(difference > 1){
                for(int j=1;j<difference;j++)
                System.out.print((arrNum[i]+j)+" ");        
            }
        }
    }
}
