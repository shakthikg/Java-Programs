class A
{
    void print()
    {
        System.out.println("Super class");
    }
}
class B extends A
{
    @Override
    void print()
    {
        System.out.println("Sub class");
    }
}
public class MethodOverriding
{
    public static void main(String[] args)
    {
        A b1 = new A();
        b1.print();
    }
}