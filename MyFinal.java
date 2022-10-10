class MyFinal
{
    public static void main(String args[])
    {
        System.out.println("Final Block");
        Honda h=new Honda();
        h.print();

    };
};
class Bike
{
    //final void print()
    void print()
    {
        System.out.println("Bike class");
    }
};
class Honda extends Bike
{
    void print()
    {
        System.out.println("Honda bike");
    }
};
