package Dynamic_Programming;

import java.util.Arrays;

public class Contiguous_Subsequence {

    public int get_Consecutive_Subsequence(int[] sequence){
        //base case 1: empty array.
        if(sequence.length==0)
        return 0;

        //base case 2: only one element in array.
        if(sequence.length==1)
            return sequence[0];

        else{
            return get_max_sum(sequence);
        }
    }

    public static int get_max_sum(int[] input){
        int sum=0;
        //Compare and set max sum
        for(int i=1; i<input.length; i++){
            input[i] = Math.max((input[i-1]+input[i]), input[i]);
        }

        //Get max possible sum.
        for(int j=0; j<input.length; j++){
            if(input[j]>sum){
                sum = input[j];
            }
        }
        return sum;
    }
}
