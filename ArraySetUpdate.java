import java.util.ArrayList;
import java.util.Scanner;
public class ArraySetUpdate
{
    public static void main(String[] args)
    {
        ArrayList<Integer> num = new ArrayList<>();
        Scanner obj = new Scanner(System.in);
        Scanner obj1 = new Scanner(System.in);
        System.out.println("Enter the total values: ");
        int size = obj.nextInt();
        System.out.println("Enter values: ");
        for(int i=0;i<size;i++)
        {
            int val = obj1.nextInt();
            num.add(val);
        }
    }
}