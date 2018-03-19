import java.io.*;
public class sudstring
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        
        int i,j;
        char m1=' ';
        char m[]=new char[20];
        i=0;
        System.out.print("Enter string :");
        
        while(m1!=(char)10)
        {
            m1=(char)in.read();
            m[i]=m1;
            if(m1!=(char)10)
            i++;
        }
        System.out.println("Enter the index:");
        int a=Integer.parseInt(in.readLine());
        for(j=a;j<=i;j++)
        
        {
            System.out.print(m[j]);
           
        }
        

    }
}
