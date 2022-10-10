import java.util.*;
import java.io.*;

class AccessSpecifiers
{
    public static void main(String args[])
    {
        System.out.println("Working with all data types");
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Your name::");
        String s1=s.nextLine();
        System.out.println(s1);
        System.out.println("Enter Your Age::");
        int a=s.nextInt();
        System.out.println(a);

        System.out.println("Enter a float Value::");
        float b=s.nextFloat();
        //To print Upto Some decimal PLaces

        System.out.format("%.2f",b);
        System.out.print("\n");
        System.out.println("Enter Another float value::");
        float c=s.nextFloat();
        System.out.format("decimal places::%.3f",c);
        System.out.println("\n");
        System.out.println("Enter a character::");
        char ch=s.next().charAt(0);
        System.out.println(ch);
        System.out.println("Enter another character::");
        char ch1=s.next().charAt(0);
        System.out.println(ch1);
        System.out.println("Enter a long value::");
        long l=s.nextLong();
        System.out.println(l);
        System.out.println("Enter a double value::");
        double d=s.nextDouble();
        System.out.println(d);


    }
}
