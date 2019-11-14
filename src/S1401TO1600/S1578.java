package S1401TO1600;

public class S1578 {
    public int countA(String s) {
        // Write your code here
        int length = s.length();
        if (length == 0) {
            return 0;
        }
        int start = 0, end = length - 1;
        if (s.charAt(0) != 'A') {
            start = getStart(s);
        }
        if (s.charAt(start) != 'A') {
            return 0;
        }
        if (s.charAt(end) != 'A') {
            end = getEnd(s);
        }
        return end - start + 1;
    }

    private int getStart(String s){
        int start = 0;
        int end = s.length() - 1;
        int mid = start + (end - start) / 2;
        char tmp = 'A';
        while (start + 1 < end) {
            tmp = s.charAt(mid);
            if (tmp == 'B') {
                start = mid + 1;
            } else if (tmp == 'A' || tmp > 'B') {
                end = mid;
            }
            mid = start + (end - start) / 2;
        }
        if (s.charAt(start) == 'A') {
            return start;
        }
        return end;
    }

    private int getEnd(String s){
        int start = 0;
        int end = s.length() - 1;
        int mid = start + (end - start) / 2;
        char tmp = 'A';
        while (start + 1 < end) {
            tmp = s.charAt(mid);
            if (tmp <= 'B') {
                start = mid;
            } else if (tmp > 'B') {
                end = mid - 1;
            }
            mid = start + (end - start) / 2;
        }
        if (s.charAt(start) == 'A') {
            return start;
        }
        return end;
    }
}
