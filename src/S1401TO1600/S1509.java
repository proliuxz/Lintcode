package S1401TO1600;

import java.util.List;

public class S1509 {
    public boolean lemonadeChange(List<Integer> bills) {
        // Write your code here.
        int n5 = 0;
        int n10 = 0;
        for (int bill: bills
             ) {
            if (bill == 5)
                n5++;
            else if (bill == 10)
            {
                n10++;
                n5--;
            }
            else if (bill == 20)
            {
                if (n10 > 0)
                {
                    n10--;
                    n5--;
                }
                else
                {
                    n5-=3;
                }
            }
            if (n5 < 0)
                return false;
        }
        return true;
    }
}
