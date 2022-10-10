class InterfacesWithConfidence
{
    public static void main(String args[])
    {
        System.out.println("Interfaces");
        Implementation i=new Implementation();
        i.print();
        i.display();

    };
};
interface Nani
{
    void print();
    double a=2.657756757;
}
interface Powerstar
{
    void display();
    double b=4.9432353;
}
class Implementation implements Nani,Powerstar
{
   public void print()
    {
        System.out.println("From Nani Interface");
        System.out.format("From power star::%.2f",b);
        System.out.println("\nFrom Powerstar Interface b::"+b);

    }
   public void display()
    {
        System.out.println("From Powerstar Interface");
        System.out.println("From Nani Interface a::"+a);
        System.out.format("From Nani Interface::%.3f",a);
    }
};
