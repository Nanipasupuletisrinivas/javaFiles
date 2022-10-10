class MultipleInheritance
{
    public static void main(String args[])
    {
        System.out.println("Multiple Inheritance");
        C c=new C();
        c.print();
    };
};
class A
{
    int a=2;
    void print()
    {
        System.out.println("class a");
    }
};
class B
{
    int b=2;
    void print()
    {
        System.out.println("class B");
    }
};
class C extends A,B//Error
{
    void print()
    {
        System.out.println("Nani Pasupuleti");
    }
};
