import java.util.ArrayList;
public class ArrayModify
{
    public static void main(String[] args)
    {
        ArrayList<String>zodiac = new ArrayList<>();
        ArrayList<Integer>order = new ArrayList<>();
        zodiac.add("Pisces");
        zodiac.add("Taurus");
        zodiac.add("Saggatirus");
        zodiac.add("Leo");
        order.add(1);
        order.add(3);
        order.add(4);
        order.add(5);
        System.out.println(zodiac.get(0));
        zodiac.remove(2);
        System.out.println(zodiac);
        order.clear();
        System.out.println(order);
    }
    
}