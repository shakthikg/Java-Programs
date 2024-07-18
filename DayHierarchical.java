class Morning
{
    public void morning()
    {
        System.out.println("Good Morning");
    }
}
class Afternoon extends Morning
{
    public void afternoon()
    {
        System.out.println("Good Afternoon");
    }
}
class Evening extends Morning
{
    public void evening()
    {
        System.out.println("Good evening");
    }
}
class Night extends Morning
{
    public void night()
    {
        System.out.println("Good night");
    }
}
public class DayHierarchical
{
    public static void main(String[] args)
    {
        Afternoon aft = new Afternoon();
        aft.morning();
        aft.afternoon();
        Evening eve = new Evening();
        eve.evening();
        Night nyt = new Night();
        nyt.night();
    }
}