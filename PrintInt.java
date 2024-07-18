import java.util.Scanner;
class PrintInt
{
    public static void main(String[] args)
    {
        int num;
        System.out.println("Enter the number to print: ");
        Scanner s = new Scanner(System.in);
        num = s.nextInt();
        System.out.println(num);
    }
}