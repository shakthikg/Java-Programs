class Encaps
{
    private String name;
    private int roll;
    private int age;
    public int getAge()     //get method for age to access
    {
        return age;         //private variable age
    }
    public String getName() //get method for name to access
    {
        return name;        //private variable name 
    }
    public  int getRoll()   
    {
        return roll;
    }
    public void setName(String newName) //set method for name to add name for input
    {
        name = newName;
    }
    public void setRoll(int newRoll)
    {
        roll = newRoll;
    }
    public void setAge(int newAge)
    {
        age = newAge;
    }
}
public class Encapsulation
{
    public static void main(String[] args)
    {
        Encaps obj = new Encaps();
        obj.setName("Rishi");       //setting values to the variable
        obj.setAge(21);
        obj.setRoll(12);
        System.out.println("Name : " +obj.getName());
        System.out.println("Age : " +obj.getAge());
        System.out.println("Roll : " +obj.getRoll());
    }
}
//direct access is not possible for the private variables declared
//so using public modifier using get method we can access and modify the varibles to get proper output even if data is encapsulated.