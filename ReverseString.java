
public class ReverseString
  {
    public static main(String args[])
    {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter a string : ");

      String str = input.nextLine();
      String reverse = "";

      int length = str.length()-1;
      for(int i = length; i >= 0; i++)
        {
          reverse = reverse + str.charAt(i);
        }
      System.out.println("Reverse string is " +reverse);
    }
  }
