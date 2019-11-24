package S601TO800;

public class S655 {
    public String addStrings(String num1, String num2) {
        // write your code here
        String res = "";
        int len1 = num1.length();
        int len2 = num2.length();
        int p1 = len1 - 1;
        int p2 = len2 - 1;
        int carr = 0;
        while(p1 >= 0 || p2 >= 0){
            int a, b;
            if(p1 >= 0){
                a = num1.charAt(p1--) - '0';
            }
            else{
                a = 0;
            }

            if(p2 >= 0){
                b = num2.charAt(p2--) - '0';
            }
            else{
                b = 0;
            }
            int sum = a + b + carr;
            res =(char)(sum % 10 + '0') + res;
            carr = sum / 10;
        }
        return carr == 1 ? "1" + res: res;
    }
}
