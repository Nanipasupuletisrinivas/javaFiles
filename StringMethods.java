//Example program on Strings
class StringMethods
{
    public static void main(String args[])
    {
        System.out.println("Program on String methods");
        String s1="Nani Pasupuleti";
        String s2="Extra jabardasth";
        System.out.println(s1.length());
        System.out.println(s2.length());
        System.out.println(s1.concat(s2));
        System.out.println(s1.substring(0,4));
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.toLowerCase());
        System.out.println(s2.toUpperCase());
        System.out.println(s1.equals(s2));
        System.out.println(s2.replace('E','D'));
        System.out.println(s2.charAt(4));


    };
};
