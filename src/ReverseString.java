

import java.util.*;
class ReverseString
{
  public static void main(String args[])
  {
    String str1, str2 = "";
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a string ");
    str1 = sc.nextLine();

    int length = str1.length();

    for (int i = length - 1 ; i >= 0 ; i--)
      str2 = str2 + str1.charAt(i);

    System.out.println("Reverse of the string: " + str2);
  }
  
}