import java.util.Scanner;
class maximumFrequency
{
    static char getMax(String str)
    {
        int arr[] = new int[256];
        int Length = str.length();
        for(int i = 0 ; i < Length; i++)
        {
            arr[str.charAt(i)]++;
        }
        int max = 0;
        char character = ' ';
        for(int i = 0 ; i < Length ; i++)
        {
            if(max < arr[str.charAt(i)])
            {
                max = arr[str.charAt(i)];
                character = str.charAt(i);
            }
        }
        return character;
    }
  
    public static void main(String[] args)
    {
       String str;
       Scanner s = new Scanner(System.in);
       str = s.nextLine();
       System.out.println(getMax(str));
    }
}