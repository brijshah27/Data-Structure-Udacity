import Dynamic_Programming.Contiguous_Subsequence;
import Dynamic_Programming.Fibonacci_Sequence;
import Dynamic_Programming.LCS;
import Dynamic_Programming.LIS;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        //DP_Algorithm 1: Fibonacci Sequence.
        System.out.println("<<<<<Fibonacci Sequence>>>>>");
        Fibonacci_Sequence fs = new Fibonacci_Sequence();
        int[] sequence = fs.Get_fibonacci_sequence(10);
        System.out.println("Fibonacci Sequence for n = 10");
        System.out.println(Arrays.toString(sequence));
        System.out.println("\n\n\n");

        //DP_Algorithm 2: Longest Increasing sub-sequence.
        System.out.println("<<<<<Longest Increasing sub-sequence>>>>>");
        LIS lis = new LIS();
        int input_to_LIS[] = { 10, 22, 9, 33, 21, 50, 41, 60 };
        int lis_result = lis.LIS(input_to_LIS, input_to_LIS.length);
        System.out.println("LIS for "+Arrays.toString(input_to_LIS)+" is:"+lis_result);
        System.out.println("\n\n\n");

        //DP_Algorithm 3: Longest Common Sub-sequence.
        System.out.println("<<<<Longest Common sub-sequence>>>>>");
        LCS lcs = new LCS();
        String s1= "ABCDGH";
        String s2= "AEDFHR";
        System.out.println("LCS for Strings "+s1 +" and "+s2);
        System.out.println(lcs.LCS(s1,s2));
        System.out.println("\n\n\n");

        //DP_Algorithm 4: Contiguous subsequence max sum.
        System.out.println("<<<<Contiguous max subsequence max sum>>>>>");
        Contiguous_Subsequence CSS = new Contiguous_Subsequence();
        int[] intput_sequence = {5, 15, -30, 10, -5, 40, 10};
        int CSS_sum = CSS.get_Consecutive_Subsequence(intput_sequence);
        System.out.println("Contiguous subsequence max sum of  "+ Arrays.toString(intput_sequence) +" is "+ CSS_sum);
        System.out.println("\n\n\n");
    }
}
