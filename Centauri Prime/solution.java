// Author : MD_Rifat(0x0mmrhr)

// Email : 0x0mmrhr.ridgwick@cyberdude.com


import java.util.*;

public class Solution {

  private static String getRuler(String kingdom) {
      
    char Char = kingdom.charAt(kingdom.length()-1);
    
    String charSet ="AEIOUY";
    
    if(charSet.lastIndexOf(Char) != -1){
        if(charSet.lastIndexOf(Char) == 5){
            return "nobody";
        }
        else{
            return "Alice";
        }
    }
    else{
        return "Bob";
    }
  }

  public static void main(String[] args) {
    try (Scanner in = new Scanner(System.in)) {
      int T = in.nextInt();

      for (int t = 1; t <= T; ++t) {
        String kingdom = in.next().toUpperCase();
        System.out.println(
            "Case #" + t + ": " + kingdom + " is ruled by " + getRuler(kingdom) + ".");
      }
    }
  }
}
