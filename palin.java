import java.util.Scanner;
class palin
{
  public static void main(String[] args)
  {
    String str;
    Scanner s = new Scanner(System.in);
    str = s.nextLine();
    int len = str.length();
    String temp = "";
    for(int i = len-1 ; i >= 0 ; i--)
    {
      temp += str.charAt(i);
    }
    if(str.equals(temp))
    {
      System.out.println("Palindrome");
    }
    else
    {
      System.out.println("Not Palindrome");
    }

  }
}