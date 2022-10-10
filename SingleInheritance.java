class SingleInheritance
{
    public static void main(String args[])
    {
        System.out.println("Single inheritance");
        B b=new B();
        b.print();
    };
};
class A
{
            String s="jk";

    void print()
    {
        System.out.println("HI ");
        int a=2;
    }
};
class B extends A
{
    void print()
    {
        System.out.println("hello");
        super.print();
        System.out.println(super.s);
    }
};
