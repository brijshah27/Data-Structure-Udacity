package Dynamic_Programming;

public class Optimal_Penalties_Travel {
    public int get_penalties(int[] hotels) {
        int[] hotel = hotels;
        int[] bestpath = new int[hotel.length];
        int[] stop = new int[hotel.length];


        for (int i = 0; i < hotel.length; i++) {
            bestpath[i] = (int) (Math.pow((200 - hotel[i]), 2)); //penalties for current hotel.
            stop[i] = 0;
            for (int j = 0; j < i; j++) {
                //Check if current best path has lesser penalties than previous path.
                if (bestpath[j] + Math.pow((200 - (hotel[i] - hotel[j])), 2) < bestpath[i]) {
                    bestpath[i] = (int) (bestpath[j] + Math.pow(
                            (200 - (hotel[i] - hotel[j])), 2));
                    stop[i] = j + 1;
                }
            }
        }
        String finalPath = "";
        int index = stop.length - 1;
        while (index >= 0) {
            finalPath = (index + 1) + " " + finalPath;
            index = stop[index] - 1;
        }
        System.out.println("Stop at: " + finalPath);

        return bestpath[hotel.length - 1];
    }


}
