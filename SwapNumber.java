public class SwapNumber
{
    public static void main(String[] args)
    {
        int x=3;
        int y=9;
        System.out.println("Before swap");
        System.out.println(x);
        System.out.println(y);
        int temp = x;
        x=y;
        y=temp;
        System.out.println("After swap");
        System.out.println(x);
        System.out.println(y);
    }
}