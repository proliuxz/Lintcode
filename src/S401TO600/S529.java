package S401TO600;

public class S529 {
    public String encode(double latitude, double longitude, int precision) {
        // write your code here
        boolean is_even = true;
        int i = 0;
        double[] lat = new double[2];
        double[] lon = new double[2];
        int bit = 0;
        int ch = 0;
        double mid = 0;
        String geohash = "";
        int[] BITS = {16, 8, 4, 2, 1};
        String BASE32 = "0123456789bcdefghjkmnpqrstuvwxyz";

        lat[0] = -90.0;
        lat[1] = 90.0;
        lon[0] = -180.0;
        lon[1] = 180.0;

        while (geohash.length() < precision) {
            if (is_even) {
                mid = (lon[0] + lon[1]) / 2;
                if (longitude > mid) {
                    ch |= BITS[bit];
                    lon[0] = mid;
                } else
                    lon[1] = mid;
            } else {
                mid = (lat[0] + lat[1]) / 2;
                if (latitude > mid) {
                    ch |= BITS[bit];
                    lat[0] = mid;
                } else
                    lat[1] = mid;
            }

            is_even = !is_even;
            if (bit < 4)
                bit++;
            else {
                geohash += BASE32.charAt(ch);
                bit = 0;
                ch = 0;
            }
        }
        return geohash;
    }
}
