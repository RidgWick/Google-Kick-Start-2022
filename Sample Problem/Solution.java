// Author : MD_Rifat(0x0mmrhr)
// Email : 0x0mmrhr.ridgwick@cyberdude.com
// Twitter : https://twitter.com/ridg__wick

import java.util.*;

public class Solution {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        long testCases = in.nextInt();
        for (int Case = 1; Case <= testCases; Case++) {

            int N = in.nextInt();
            int M = in.nextInt();
            int sumOfAllCandies = 0;
            
            for (int i = 0; i < N; ++i) {
                sumOfAllCandies += in.nextInt();
            }

            System.out.println("Case #" + Case + ": " + (sumOfAllCandies % M) );
        }
    }
}
