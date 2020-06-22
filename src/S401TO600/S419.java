package S401TO600;

public class S419 {
    public int romanToInt(String s) {
        int iCount = 0;
        int vCount = 0;
        int xCount = 0;
        int lCount = 0;
        int cCount = 0;
        int dCount = 0;
        int mCount = 0;
        int ivCount = 0;
        int ixCount = 0;
        int xlCount = 0;
        int xcCount = 0;
        int cdCount = 0;
        int cmCount = 0;

        for (int i = 0; i < s.length();i++)
        {
            switch(s.charAt(i)) {
                case 'I': iCount++;
                    if (i + 1 != s.length())
                    {
                        if (s.charAt(i + 1) == 'V')
                            ivCount++;
                        if (s.charAt(i + 1) == 'X')
                            ixCount++;
                    }
                    break;
                case 'V': vCount++; break;
                case 'X': xCount++;
                    if (i + 1 != s.length())
                    {
                        if (s.charAt(i + 1) == 'L')
                            xlCount++;
                        if (s.charAt(i + 1) == 'C')
                            xcCount++;
                    }
                    break;
                case 'L': lCount++; break;
                case 'C': cCount++;
                    if (i + 1 != s.length())
                    {
                        if (s.charAt(i + 1) == 'D')
                            cdCount++;
                        if (s.charAt(i + 1) == 'M')
                            cmCount++;
                    } break;
                case 'D': dCount++; break;
                case 'M': mCount++; break;
            }
        }
        int result = iCount + 5 * vCount + 10 * xCount + 50 * lCount + 100 * cCount
                + 500 * dCount + 1000 * mCount - 2*ivCount - 2* ixCount - 20*xlCount-20*xcCount
                - 200* cdCount - 200*cmCount;
        return result;
    }
}
