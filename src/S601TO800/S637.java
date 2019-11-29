package S601TO800;

public class S637 {
    public boolean validWordAbbreviation(String word, String abbr) {
        // write your code here
        char[] arrW = word.toCharArray();
        char[] arrA = abbr.toCharArray();
        int lenW = word.length();
        int lenA = abbr.length();
        int pW = 0;
        int pA = 0;
        while (pW < lenW && pA < lenA)
        {
            if (!Character.isDigit(arrA[pA]))
            {
                if (arrA[pA] == arrW[pW])
                {
                    pA++;
                    pW++;
                }
                else
                {
                    return false;
                }
            }
            else{
                if(arrA[pA] == '0')
                    return false;
                int val = 0;
                while (pA < lenA && Character.isDigit(arrA[pA])) {
                    val = val * 10 + arrA[pA] - '0';
                    pA++;
                }
                pW += val;
            }
        }
        return pA == lenA && pW == lenW;
    }

    public static void main(String[] args)
    {
        S637 s = new S637();
        String word = "internationalization";
        String abbr = "i12iz4n";
        boolean res = s.validWordAbbreviation(word, abbr);
        System.out.println(res);
    }
}
