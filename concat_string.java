import java.io.*;
public class concat_string
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        int i,a,f,g;
        char m1=' ',m2=' ';
        char m[]=new char[20];
        i=0;
        a=0;
        f=0;
        g=0;
        System.out.print("Enter the first string :");
        while(m1!=(char)10)
        {
            m1=(char)in.read();
            m[i]=m1;
            i++;
        }
        
        char q[]=new char[20];
        System.out.println("Enter the second String:");
        while(m2!=(char)10)
        {
            m2=(char)in.read();
            q[a]=m2;
            a++;
        }
        for(f=0;f<=i-1;f++)
        System.out.print(m[f]);
        for(g=0;g<=a-1;g++)
        System.out.print(q[g]);
    }
}