class Father
{
    int age1 = 48;
    class Son
    {
        int age = 22;
    }
}                       
public class Main1                 //Innerclass (Nested class)
{
    public static void main(String[] args)
    {
        Father fs = new Father();
        Father.Son sf = fs.new Son();
        System.out.println(sf.age+fs.age1);
    }
}