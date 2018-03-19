import java.io.*;
public class compareto_string
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        int i,a;
        char m1=' ',m2=' ';
        char m[]=new char[20];
        i=0;
        a=0;
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
        if(i>a)
        System.out.println("First String is greater than the Second String");
        else if(a>i)
        System.out.println("Second String is greater than the First String");
        else if(a==i)
        System.out.println("First String and the Second String are same");
    }
}
        
        
        
        
        