class interfaces
{
    public static void main(String args[])
    {
        //System.out.println("Interface Implementation");
        Mine a=new Mine();
        a.print();
        a.display();

    };
};
interface A1
{
    int a=9;
    void print();
}
interface  A2
{
    String s="Nani";
    void display();
}
class Mine implements A1,A2
{
    public void print()
    {
        System.out.println("Interface Implemented");
        System.out.println(" a value is::"+a);
    }
    public void display()
    {
        System.out.println("2nd interface Implemented");
        System.out.println(s);
    }

};
