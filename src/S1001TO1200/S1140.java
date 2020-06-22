package S1001TO1200;

import java.time.YearMonth;

public class S1140 {
    public int getTheMonthDays(int year, int month) {
        return YearMonth.of(year, month).lengthOfMonth();
    }
}
