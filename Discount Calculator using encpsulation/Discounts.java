import java.util.Scanner;
class CalDisc{
    public int ICode;
    public String Name;
    public float Price;
    public int Quantity;
    public int Discount;
   
    public int FindDisc(int q){
        if(q<=50){
            return 0;
        }
        else if(q>50 && q<=100){
            return 5;
        }
        else{
            return 100;
        }
    }
}    
public class Discounts{
    public static void main(String [] args){
        
        Scanner sc =new Scanner(System.in);
        CalDisc obj =new CalDisc();
        System.out.print("\nEnter the Name: ");
        obj.Name=sc.nextLine();
        System.out.print("Enter the ICode: ");
        obj.ICode=sc.nextInt();
       
        System.out.print("Enter the Price: ");
        obj.Price=sc.nextFloat();
        System.out.print("Enter the Quantity: ");
        obj.Quantity=sc.nextInt(); 
        System.out.print("\nOUTPUT: "+"\nICode : "+obj.ICode+"\nName : "+obj.Name+"\nPrice : "+obj.Price+"\nQuantity: "+obj.Quantity+"\nDiscount: "+obj.FindDisc(obj.Quantity));       
    }


}

