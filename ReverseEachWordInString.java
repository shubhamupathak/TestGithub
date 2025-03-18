import java.util.Scanner;
public class ReverseEachWordInString 
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string : ");

        String str = input.nextLine();
        String reverse = "";

        String words[] = str.split(" ");
        for(String wordstr : words)
        {
            String Word = wordstr;
            char ch;
            String empstr = "";
            for(int i = 0; i < Word.length(); i++)
            {
                ch = Word.charAt(i);
                empstr = ch + empstr;
            }

            reverse = reverse+empstr+" ";
        }

        System.out.println(reverse);
    }
    
}

//In Reverse each words in string we need to first split the string by space.
