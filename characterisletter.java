public class characterisletter
{
    public static int main(char a)
    {
        int v=(int)a;
        if((v>=65)&&(v<=90)||(v>=97)&&(v<=122))
        {
            //System.out.println("The character is letter");
            return 1;
        }
        else
        {
//            System.out.println("The character is not a letter");
    return 0;
        }
    }
}