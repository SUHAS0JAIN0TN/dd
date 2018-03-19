import java.io.*;
public class equals_with_ignorecase_string
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        int i,j,a;
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
        
        for(j=0;j<=i;j++)
        {
            if((int)m[j]==(int)q[j]||(int)m[j]==(int)q[j]+32||(int)m[j]==(int)q[j]-32)
            {
                System.out.println("Both the Strings are same");
                break;
            }
            else
            {
                System.out.println("Both the Strings not are same");
                break;
            }
        }
    }
}
