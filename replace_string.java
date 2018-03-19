import java.io.*;
public class replace_string
{
    public static void main(String args[])throws IOException
    {
        int cnt=0,i=0,s,b,q;
        char m1=' ';
        char e[]=new char[20];
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
        char l=' ';
        System.out.println("ENTER THE CHARACTER WHICH SHOULD BE REMOVED");
        l=(char)in.read();
        char h=' ';
        System.out.println("ENTER THE CHARACTER WHICH SHOULD BE ADDED");
        h=(char)in.read();
        h=(char)in.read();
        {
            while(i<=cnt)
            {
                if((int)e[i]==(int)l)
                e[i]=h;
                i++;
            }
        }
        for(b=0;b<=cnt-1;b++)
        System.out.print(e[b]);
    }
}
