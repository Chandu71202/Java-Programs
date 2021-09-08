import java.util.Scanner;
class abc{
    static void matpat(int [] arr,int size){
        int [][] mat = new int[20][20];
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if((i+j)>=size){
                    mat[i][j]=0;
                }
                else{
                    mat[i][j]=arr[j];
                }
            }
        }
        System.out.println("\n Output: ");
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                System.out.print(" "+mat[i][j]);
            }
            System.out.println();
        }       
    }
    public static void main(String[] args){ 
        Scanner sc =new Scanner(System.in);
        int n;
        int [] a =new int[10];
        System.out.print("Enter the size of the array : ");
        n=sc.nextInt();
        System.out.print("Enter the array elements : ");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.print("\nYour array: ");
        for(int i=0;i<n;i++){
            System.out.print(" "+a[i]);
        }
        matpat(a,n);

    }
}
