class Fibonacci
{
    public static void main(String args[])
    {
        int n=12,a=0,b=1;
        for(int i=1;i<=n;i++)
        {
            System.out.println(a+" ");
            int sum=a+b;
            a=b;
            b=sum;
        }
    }
}