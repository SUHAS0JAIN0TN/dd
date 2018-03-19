import java.io.*;
public class index_of_string
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        
        int i,j;
        char m1=' ';
        char m[]=new char[20];
        System.out.println("Enter the value from where should the counting starts:");
        int w=Integer.parseInt(in.readLine());
        i=0;
        System.out.print("Enter string :");
        while(m1!=(char)10)
        {
            m1=(char)in.read();
            m[i]=m1;
            i++;
        }
        System.out.println("Enter the character:");
        char s=(char)in.read();
        for(j=w;j<=i;j++)
        {
            if((int)m[j]==(int)s)
            {
                System.out.println("The position of "+s+" is "+j);
                break;
            }
        }
    }
}
