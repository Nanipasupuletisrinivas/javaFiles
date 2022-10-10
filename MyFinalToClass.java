class MyFinalToClass
{
    public static void main(String args[])
    {
        System.out.println("final to Class");
        Connection c=new Connection();
        c.print();
    };
};
//final class Cable
class Cable
{
    void print()
    {
        System.out.println("Cable class");
    }
};
class Connection extends Cable
{
    void print()
    {
        System.out.println("Connection class");
    }
};
