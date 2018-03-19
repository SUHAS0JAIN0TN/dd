import java.io.*;
public class length_string
{
    public static void main(String args[])throws IOException
    {
        int cnt=0;
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        System.out.println("enter a string");
        char m=' ';
        while(m!=(char)10)
        {
        m=(char)in.read();
        if(m!=10)
        cnt++;
        }
        System.out.println(cnt);
    }
}
