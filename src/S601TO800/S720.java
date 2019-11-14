package S601TO800;

public class S720 {
    public String rearrange(String str) {
        // Write your code here
        int[] alphabets = new int[26];
        int[] nums = new int[10];
        boolean zFlag = false;
        for (int i = 0; i < str.length() ; i++) {
            char c = str.charAt(i);
            if (Character.isDigit(c))
            {
                nums[c-'0']++;
                zFlag = true;
            }
            else
                alphabets[c-'A']++;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < alphabets.length ; i++) {
            int size = alphabets[i];
            while (size > 0)
            {
                sb.append((char) ( 'A' + i ));
                size--;
            }
        }
        int res = 0;
        for (int i = 1; i < nums.length; i++)
            res += i * nums[i];

        if (zFlag)
            sb.append(res);
        return sb.toString();
    }
    public static void main(String[] args)
    {
        S720 s = new S720();
        String str = "";
        System.out.println(s.rearrange(str));
    }
}
