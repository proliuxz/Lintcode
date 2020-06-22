package S1801TO2000;

public class S1890 {
    public String formMinimumNumber(String str) {
        int max = 0;
        int lastEntry = 0;
        int j;
        String res = new String();
        for (int i = 0; i < str.length(); i++)
        {

            int nextCntD = 0;
            switch (str.charAt(i))
            {
                case 'I':
                    j = i + 1;
                    while (j < str.length() && str.charAt(j) == 'D')
                    {
                        nextCntD++;
                        j++;
                    }

                    if (i == 0)
                    {
                        max = nextCntD + 2;
                        res += ++lastEntry;
                        res += max;
                        lastEntry = max;
                    }
                    else
                    {
                        max = max + nextCntD + 1;
                        lastEntry = max;
                        res += lastEntry;
                    }
                    for (int k = 0; k < nextCntD; k++)
                    {
                        res += --lastEntry;
                        i++;
                    }
                    break;

                case 'D':
                    if (i == 0)
                    {
                        j = i + 1;
                        while (j < str.length()&&str.charAt(j) == 'D')
                        {
                            nextCntD++;
                            j++;
                        }

                        max = nextCntD + 2;
                        res += max;
                        res += (max - 1);
                        lastEntry = max - 1;
                    }
                    else
                    {
                        res += (lastEntry - 1);
                        lastEntry--;
                    }
                    break;
            }
        }
        return res;
    }
}
