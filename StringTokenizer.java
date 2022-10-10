import java.util.StringTokenizer;
class StringTokenizer
{
    public static void main(String args[])
    {
        System.out.println("String Tokenizer");
        StringTokenizer st=new StringTokenizer("Hello Nani Pasupuleti");
        while(st.hasMoreTokens())
        {
            System.out.println(st.nextToken());
        }
    };
};
