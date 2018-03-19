import java.io.*;
public class isuppercase
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        System.out.println("Enter the Character");
        char n=(char)in.read();
        int m=(int)n;
        if((m>=65)&&(m<=90))
        {
        System.out.println("The character is in Uppercase");
        }
        else
        {
            System.out.println("The character is in Lowercase");
        }
    }
}