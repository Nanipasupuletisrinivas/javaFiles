class StringMethids
{
    public static void main(String args[])
    {
        String s=" Extra  Jabardasth";
        System.out.println(s.length());
        String s1="Nani Pasupuleti";
        System.out.println(s1.length());
        System.out.println(s1.charAt(4));
        System.out.println(s.substring(0,4));
        System.out.println(s1.concat(s));
        System.out.println(s.equals(s1));
        String s2="Extra Jabardasth";
        String s3="Extra Jabardasth";
        String s4="EXTRA JABARDASTH";
        System.out.println(s2.equals(s3));
        System.out.println(s2.equalsIgnoreCase(s4));
        System.out.println(s2.compareTo(s4));
        System.out.println(s1.toLowerCase());
        System.out.println(s.toLowerCase());
        System.out.println(s1.toUpperCase());
        System.out.println(s2.toUpperCase());
        System.out.println(s1.replace('P','A'));
    };
};
