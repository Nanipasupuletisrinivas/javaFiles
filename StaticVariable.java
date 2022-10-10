class StaticVariable
{
    static int i=120;
    public static void main(String args[])
    {
        System.out.println("Main function");
        System.out.println(i);
        System.out.println(A.a);
        A.display();
    };
};
static class A
{
   static  int a=2;
   static void display()
   {
       System.out.println("Static method");
   }

};
