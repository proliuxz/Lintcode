package S401TO600;

public class S530 {
    public double[] decode(String geohash) {
        // write your code here
        boolean is_even = true;
        double[] lat = new double[2];
        double[] lon = new double[2];
        lat[0] = -90.0;  lat[1] = 90.0;
        lon[0] = -180.0; lon[1] = 180.0;
        double lat_err = 90.0;
        double lon_err = 180.0;
        int[] BITS = {16, 8, 4, 2, 1};
        String BASE32 = "0123456789bcdefghjkmnpqrstuvwxyz";
        for (int i = 0; i<geohash.length(); i++) {
            int c = geohash.charAt(i);
            int cd = BASE32.indexOf(c);
            for (int j = 0; j < 5; j++) {
                int mask = BITS[j];
                if (is_even) {
                    lon_err /= 2;
                    refine_interval(lon, cd, mask);
                } else {
                    lat_err /= 2;
                    refine_interval(lat, cd, mask);
                }
                is_even = !is_even;
            }
        }
        return new double[]{ (lat[0] + lat[1])/2, (lon[0] + lon[1])/2 };
    }

    private void refine_interval(double[] interval, int cd, int mask) {
        if ((cd&mask) > 0)
            interval[0] = (interval[0] + interval[1])/2;
        else
            interval[1] = (interval[0] + interval[1])/2;
    }
}
