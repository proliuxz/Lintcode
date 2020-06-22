package ext;

public class DY {
    public int solve(int numOfMovies, int numofHpyVal, int[] movies, int hpyVals[]){
        int res = 0;
        int[][] dp = new int[movies.length][movies.length];
        for (int i = 0; i < movies.length - 1; i++) {
            for (int j = i + 1; j < movies.length; j++) {
                int[] watched = new int[movies.length];
                int tmp = 0;
                for (int k = i; k <= j; k++) {
                    int movie = movies[k];
                    if (watched[movie - 1] == 0)
                        tmp += hpyVals[movie - 1];
                    else if (watched[movie - 1] == 1)
                        tmp -= hpyVals[movie - 1];
                    watched[movie - 1]++;
                }
                res = Math.max(res, tmp);
            }
        }
        return res;
    }

    public static void main(String[] args)
    {
        DY dy = new DY();
        int res = dy.solve(0,0, new int[] {2,3,1,1,4,1,2,4,1}, new int[] {5,3,6,6});
        System.out.println(res);
    }
}
