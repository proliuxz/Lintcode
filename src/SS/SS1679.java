package SS;

public class SS1679 {
    public String luckyNumber(String n) {
        // Write your code here.
        if(n.length() % 2 == 1)
        {
            int qty = (n.length() + 1)/2;
            StringBuilder sb = new StringBuilder();
            sb = add3(sb,qty);
            sb = add5(sb,qty);
            return sb.toString();
        }
        else
        {
            int qty = n.length()/2;
            return setNumber(n, qty, qty);
        }
    }

    private String setNumber(String n, int r3, int r5)
    {
        if (n == null || n.length() ==0)
            return "";
        int len = n.length();
        StringBuilder sb = new StringBuilder();
        int first = n.charAt(0)-'0';
        if(first<3) {
            sb = add3(sb, r3);
            sb = add5(sb, r5);
            return sb.toString();
        }
        else if (first == 3) {
            if (r3 > 0)
            {
                String s1 = "3" + setNumber(n.substring(1) , r3 - 1, r5);
                sb = add3(sb,r3);
                sb = add5(sb,r5-1);
                String s2 = "5" + sb.toString();
                if (s1.length() == s2.length()?s1.compareTo(s2)<0:s1.length()<s2.length())
                    return s1;
                else
                    return s2;
            }
            else
            {
                sb = add5(sb, r5);
                return sb.toString();
            }
        }
        else if (first < 5) {
            sb = add5(sb , 1);
            sb = add3(sb,  r3);
            sb = add5(sb, r5 -1);
            return sb.toString();
        }
        else if (first == 5) {
            if (r5 == 0)
            {
                sb = add3(sb, r3 + 1);
                sb = add5(sb, r5 + 1);
                return sb.toString();
            }
            else
            {
                String s1 = "5" + setNumber(n.substring(1), r3, r5 -1 );
                add3(sb, r3+1);
                add5(sb, r5+1);
                String s2 = sb.toString();
                if (s1.length() == s2.length()?s1.compareTo(s2)<0:s1.length()<s2.length())
                    return s1;
                else
                    return s2;
            }
        }
        else
        {
            sb = add3(sb, r3+1);
            sb = add5(sb, r5+1);
            return sb.toString();
        }
    }

    private StringBuilder add3(StringBuilder sb, int times)
    {
        for (int i = 0; i <times ; i++) {
            sb.append('3');
        }
        return sb;
    }

    private StringBuilder add5(StringBuilder sb, int times)
    {
        for (int i = 0; i <times ; i++) {
            sb.append('5');
        }
        return sb;
    }

    public static void main(String[] args)
    {
        SS1679 s = new SS1679();
        System.out.println(s.luckyNumber("35"));
    }
}
