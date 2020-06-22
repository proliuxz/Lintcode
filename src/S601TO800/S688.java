package S601TO800;

public class S688 {
    int[] sep = {1000000000, 1000000, 1000, 100, 10};
    String[] get3sep = {"billion", "million", "thousand", "hundred"};
    String[] get1 = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    String[] get10 = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
    String[] get100 = {"", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

    public String convertWords(int number) {
        if (number == 0)
            return "zero";

        StringBuilder sb = new StringBuilder();
        return helper(number, sb).toString().trim();
    }

    public StringBuilder helper(int num, StringBuilder sb) {
        for (int i = 0; i < 5; i++) {
            if (num == 0)
                break;

            int result = num / sep[i];
            int reminder = num % sep[i];

            if (i < 4 && result > 0) {
                helper(result, sb);
                sb.append(" " + get3sep[i]);
                num = reminder;
            }

            if (i == 4) {

                if (result == 0 && reminder > 0)
                    sb.append(" " + get1[reminder]);

                if (result == 1)
                    sb.append(" " + get10[reminder]);


                if (result > 1) {
                    sb.append(" " + get100[result]);
                    if (reminder > 0)
                        sb.append(" " + get1[reminder]);
                }
            }
        }
        return sb;
    }
}
