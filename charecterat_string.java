import java.io.*;
public class charecterat_string
{
    public static void main(String rags[])throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        char m=' ';
        int i=0;
         char marr[]= new char[20];
             System.out.print("Enter the String :");
        while(m!=(char)10)
        {
        m=(char)in.read();
        marr[i]=m;
        i++;
        }
        System.out.println("Enter the index");
        int pos=Integer.parseInt(in.readLine());
        System.out.print(marr[pos]);
}
}
    