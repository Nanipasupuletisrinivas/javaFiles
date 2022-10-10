class Static
{
    public static void main(String args[])
    {
        System.out.println("Static keyword");
        //A a=new A();
        A.method();

    };
};
class A
{
    static int c=0;

  static void method()
    {
        c++;
        System.out.println(c);
    }

};


