package S401TO600;

public class S407 {
    public int[] plusOne(int[] digits) {
        // write your code here
        if (digits == null || digits.length == 0)
            return null;

        int plus = 1;
        for (int i = digits.length - 1; i >= 0; i--)
        {
            int temp = digits[i];
            digits[i] = (temp + plus) % 10;
            plus = (temp + plus) / 10;
            if (plus == 0)
                return digits;
        }

        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }
}
