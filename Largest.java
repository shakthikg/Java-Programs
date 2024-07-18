public class Largest
{
    public static void main(String[] args)
    {
        int n1=300;
        double n2=3.9;
        int n3=12;
        if(n1>=n2 && n1>=n3)
        {
            System.out.println(n1+ " is largest of three.");
        }
        else if(n2>=n1 && n2>=n3)
        {
            System.out.println(n2+ " is largest of three.");
        }
        else
        {
            System.out.println(n3+ " is largest of three");
        }
    }
}