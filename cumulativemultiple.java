import java.util.Scanner;
class cumulativemultiple{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        try{   
                System.out.print("enter size of an array: ");
                int n=sc.nextInt();
                int[] arrNum=new int[n];
                System.out.print("enter array elements:");
                for(int i=0;i<n;i++){
                    arrNum[i]=sc.nextInt();
                }
                for(int i=0;i<n-1;i++)
                {
                    arrNum[i+1]=arrNum[i+1]*arrNum[i];
                }
                 for(int i=0;i<n;i++)
                {
                    System.out.print(arrNum[i]+" ");
                }
            }
        catch(ArrayIndexOutOfBoundsException e){
           System.out.println("Array index out of bound exception");
        }
    }
}
