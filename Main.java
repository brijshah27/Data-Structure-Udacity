import Dynamic_Programming.*;

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

        //DP_Algorithm 5: Optimal Penalties to travel.
        //Problem statement:
        //You are going on a long trip. You start on the road at mile post 0.
        //Along the way there are n hotels, at mile posts a1 < a2 < . . . < an, where each ai is measured from the starting point.
        //The only places you are allowed to stop are at these hotels, but you can choose which of the hotels you stop at.
        //You must stop at the final hotel (at distance an), which is your destination.
        //You’d ideally like to travel 200 miles a day, but this may not be possible (depending on the spacing of the hotels).
        //If you travel x miles during a day, the penalty for that day is (200 − x)2 .
        //You want to plan your trip so as to minimize the total penalty- that is, the sum, over all travel days, of the daily penalties.
        //Give an efficient algorithm that determines the optimal sequence of hotels at which to stop.

        System.out.println("<<<<Optimal Penalties to travel>>>>>");
        Optimal_Penalties_Travel OPT = new Optimal_Penalties_Travel();
        int[] hotels = {190, 420, 550, 660, 670 };
        int penalties = OPT.get_penalties(hotels);
        System.out.println("Optimal Penalties to travel from hotels at "+ Arrays.toString(hotels) +" miles is "+ penalties);
        System.out.println("\n\n\n");

        //DP_Algorithm 6: KnapSack problem
        //Given array of values and weight.
        //Find group of items with max value with capacity of given total weight.
        //Return max value that can be put in KnapSack.
        //No repetition of items allowed.
        System.out.println("<<<<KnapSack no repetition>>>>>");
        int val[] = new int[]{60, 100, 120};
        int wt[] = new int[]{10, 20, 30};
        int  W = 50;
        int n = val.length;
        int knapSack = new Knapsack_No_Repeat().get_Knapsack(W, wt,val, n);
        System.out.println("Max value that can be hold in knapSack is: "+knapSack);
        System.out.println("\n\n\n");
    }
}
