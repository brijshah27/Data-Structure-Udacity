package Dynamic_Programming;

import java.util.Arrays;

public class Fibonacci_Sequence {
    public static void main(String[] args){
        int[] sequence = Get_fibonacci_fequence(10);
        System.out.println(Arrays.toString(sequence));
    }

    public static int[] Get_fibonacci_fequence(int n){
        int[] sequence = new int[n+1];
        sequence[0] = 0;
        sequence[1] = 1;
        if(n==0) return sequence;

        if(n==1) return sequence;
        
        for(int i=2; i<=n; i++){
            sequence[i] = sequence[i-1] + sequence[i-2];
        }
        return sequence;
    }
}
