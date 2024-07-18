import java.util.Random;
public class RandomGenerate
{
    public static void main(String args[])
    {
        Random rdm = new Random();
        int rdm_int1 = rdm.nextInt(100);
        int rdm_int2 = rdm.nextInt(200);
        System.out.println("Random Integers: "+rdm_int1);
        System.out.println("Random Integers: "+rdm_int2);
    }
}