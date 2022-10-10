class MethodOverridingInExtendedClass
{
    public static void main(String argsp[])
    {

        System.out.println("EXTENDING CLASS");
        Honda h=new Honda();
        h.method();
        h.method();
        //Bike b=new Bike();
        //b.method();

    };
};
class Bike
{
    public void method()
    {
        System.out.println("Class");
    };
};
class Honda extends Bike
{
    public void method()
    {
        System.out.println("extended class");
    };
};
