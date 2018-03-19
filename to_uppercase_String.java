import java.io.*;
public class to_uppercase_String
{
    public static void main(String args[])throws IOException
    {
        int cnt=0,i=0,s,b;
        char m1=' ';
        char e[]=new char[20];
        char a[]=new char[20];
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        System.out.println("ENTER THE STRING");
        while(m1!=(char)10)
        {
            m1=(char)in.read();
            if(m1!=10)
            {
            e[cnt]=m1;
            cnt++;
            }
        }
        for(i=0;i<=cnt;i++)
        {
            s=((int)e[i])-32;
            a[i]=(char)s;
        }
        for(b=0;b<=cnt-1;b++)
        System.out.print(a[b]);
    }
}
