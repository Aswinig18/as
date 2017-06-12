import java.io.*;
import java.util.*;
class alpha
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String s1=s.nextLine();
        char ch[]=s1.toCharArray();
        int a=ch[0];
        if((64<a||96<a) && (91>a||123>a))
        {
            System.out.println("alphabet");
        }
        else
        {
            System.out.println("not");
        }
    }
}
