class Interfaceagain
{
    public static void main(String args[])
    {
        System.out.println("Implementation of Interface");
        Main main=new Main();
        main.print();
        main.display();
    };
};
interface a
{
    void display();
    //double a=9.99999;
}
interface b
{
    void print();
//    String s="Nani";

}
class Main implements a,b
{
     public void print()
    {
        System.out.println("Print method()");
    }
    public void display()
    {
        System.out.println("Diplay () method");
    }
};
