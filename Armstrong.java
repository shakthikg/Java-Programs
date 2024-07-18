public class Armstrong
{
    public static void main(String[] args)
    {
        int num = 153, num1,rem,res=0;
        num1 = num;
        while (num1 !=0)
        {
            rem = num1 % 10;
            res += Math.pow(rem, 3);
            num1 /= 10;
        }
        if(res == num)
        {
            System.out.println(num+ " is an armstrong number");
        }
        else
        {
            System.out.println(num+ " is not an armstrong number");
        }
    }
}