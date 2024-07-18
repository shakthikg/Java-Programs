class pop
{
    int msg(int a)
    {
        return a;
    }
    int msg(int a, int b)
    {
        return a*a;
    }
    double msg(int a, double b)
    {
        return a*b;
    }
}
public class MethodOverloading
{
    public static void main(String[] args)
    {
        pop d1 = new pop();
        System.out.println(d1.msg(10,10.2));
        System.out.println(d1.msg(10));
        System.out.println(d1.msg(10,20));
    }
}