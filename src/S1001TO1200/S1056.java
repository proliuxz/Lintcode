package S1001TO1200;

public class S1056 {
    public char nextGreatestLetter(char[] letters, char target) {
        int l = 0;
        int r = letters.length - 1;
        while (l <= r)
        {
            int mid = (l + r) >> 1;
            if(letters[mid] <= target)
                l = mid + 1;
            else
                r = mid-1;
        }
        if(l >= 0 && l < letters.length)
            return letters[l];
        else
            return letters[0];
    }
}
