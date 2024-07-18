class Cadbury
{
    public void choco()
    {
        System.out.println("DairyMilk");
    }
}
class Nestle extends Cadbury    //child class nestle inherits from cadbury
{
    public void choco1()
    {
        System.out.println("Kitkat");
    }
}
class Lotte extends Nestle  //child class lotte inherits from nestle
{
    public void choco2()    
    {
        System.out.println("ChocoPie");
    }
}
public class Chocolate2In
{
    public static void main(String[] args)
    {
        Lotte c = new Lotte();  //creating the object for lotte
        c.choco();
        c.choco1();
        c.choco2();
    }
}