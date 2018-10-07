import java.util.Scanner;
class T
{
  public static void main(String[] args)
  {
    String s;
    int temp;
    Scanner s1 = new Scanner(System.in);
    s = s1.nextLine();
    for(int i = 0 ; i < s.length() ; i++)
    {
      if(s.charAt(i) != ' ')
      {
       if(s.charAt(i) >='a' && s.charAt(i) <='z')
       {
           temp = (int)s.charAt(i);
           temp -=32;
           System.out.print((char)temp);
       }
       else
       {
           temp = (int)s.charAt(i);
           temp +=32;
           System.out.print((char)temp);
       }
      }
      else System.out.print(" ");
    }
    
  }
}