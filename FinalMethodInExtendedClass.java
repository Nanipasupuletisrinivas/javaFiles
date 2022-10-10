//final method in extending class
class FinalMethodInExtendedClass
{
    public static void main(String args[])
    {
        System.out.println("Main Method");
        Hero h=new Hero();
        h.method();
    };
};
class Bike
{
    void method()
    {
        System.out.println("bIKE CLASS");
    }
};
class Hero extends Bike
{
    void method()
    {
        System.out.println("Hero class");

    }
};
