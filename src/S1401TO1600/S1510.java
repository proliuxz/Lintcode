package S1401TO1600;

public class S1510 {
    public boolean buddyStrings(String A, String B) {
        if (A.length() != B.length())
            return false;

        int[] letterCount = new int[26];
        boolean hasDups = false;
        int swapIdx = -1;
        int count = 0;
        for(int i=0; i< A.length(); i++)
        {
            if (A.charAt(i)!= B.charAt(i))
            {
                if (count == 0)
                {
                    swapIdx = i;
                    count++;
                }
                else if (swapIdx == -1)
                    return false;
                else if (A.charAt(swapIdx) == B.charAt(i) && B.charAt(swapIdx) == A.charAt(i))
                    swapIdx = -1;

            }
            letterCount[A.charAt(i) - 'a']++;
            if (letterCount[A.charAt(i) - 'a'] > 1)
                hasDups = true;
        }
        return ((count == 1 && swapIdx == -1)||(count == 0 && hasDups));
    }
}
