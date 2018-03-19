import java.io.*;
public class tolowercase
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        System.out.println("Enter the Character");
        char n=(char)in.read();
        
        int m=(int)n;
        
        int m1=m-32;
        
        char g=(char)m1;
        System.out.println(g);
    }
}