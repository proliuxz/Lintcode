package S801TO1000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Movie {
    private int price;
    private int profit;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getProfit() {
        return profit;
    }

    public void setProfit(int profit) {
        this.profit = profit;
    }

    Movie(int p, int f)
    {
        price = p;
        profit = f;
    }
}

public class S970 {
    public int bigBusiness(int[] a, int[] b, int k) {
        List<Movie> movies = new ArrayList<>();
        int len = a.length;
        for (int i = 0; i < len; i++) {
            int f = b[i] - a[i];
            if (f > 0)
                movies.add(new Movie(a[i], f));
        }
        Collections.sort(movies, Comparator.comparingInt(Movie::getPrice));
        int result = k;
        for (Movie m: movies
             ) {
            if (result >= m.getPrice())
            {
                result += m.getProfit();
            }
            else
            {
                break;
            }
        }
        return result;
    }
    public static void main(String[] args){
        S970 s = new S970();
        int[] a = {3,1,5};
        int[] b = {4,3,100};
        int res = s.bigBusiness(a,b,1);
        System.out.println(res);
    }
}


