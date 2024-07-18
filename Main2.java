class StaticIC
{
    int a = 12;
    static class B
    {
        int b = 13;
    }
}
public class Main2
{
    public static void main(String[] args)
    {
        StaticIC sic = new StaticIC();
        StaticIC.B b1 = new StaticIC.B();
        System.out.println(b1.b);
        System.out.println(sic.a);
    }
}