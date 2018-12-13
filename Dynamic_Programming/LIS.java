package Dynamic_Programming;

public class LIS {

    public int LIS(int[] input, int n){
        int[] LIS = new int[n];
        int max = 0;

        //Initialize LIS to be 1 for all indexes
        for(int i=0; i<n; i++)
            LIS[i] = 1;

        //Compute optimal LIS by comparing with previous index & LIS.
        for(int i=1; i<n; i++){
            for(int j=0; j<i; j++){
                if(input[i] > input[j] && LIS[i] < LIS[j]+1){
                    LIS[i] = LIS[j]+1;
                }
            }
        }

        //Get the max LIS.
        for(int i=0; i<n; i++){
            if (LIS[i] > max)
                max = LIS[i];
        }
        return max;
    }
}
