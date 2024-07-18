class Alphabets
{
    public void symbol()
    {
        System.out.println("------");
    }
}
class Letter extends Alphabets
{
    public void letter()
    {
        System.out.println("ABCD");
    }
}
public class Inheritance1
{
    public static void main(String[] args)
    {
        Letter g = new Letter();
        g.symbol();
        g.letter();
        g.symbol();
    }
}