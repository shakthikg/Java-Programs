public class PrintPattern
{
    public static void printPattern(int n)
    {
        int i,j;
        for (i=1;i<=n;i++)
        {
            for(j=1;j<=n-i;j++)
            {
                System.out.println(" ");
            }
            for(j=1;j<=i;j++)
            {
                System.out.println(i+ " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        {
            int n = 6;
            printPattern(n);
        }
    }
}