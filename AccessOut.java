class Mainclass
{
    int n = 20;
    class Subclass
    {
        int show()
        {
            return n;
        }
    }
}
public class AccessOut  //accessing outer class from inner class
{
    public static void main(String[] args)
    {
        Mainclass m1 = new Mainclass();
        Mainclass.Subclass ms = m1.new Subclass();
        System.out.println(ms.show());
    }
}