//Finasl method
class FinalMethod
{
    static
    {
        double a=9.44424;
        System.out.println("i am alwaysd first");
        System.out.format("Value of a::%.2f"+a);

    }
    static public void method()
    {
        System.out.println("Method  1 ");
    }
    public static void main(String args[])
    {
        FinalMethod.method();
    };
};
