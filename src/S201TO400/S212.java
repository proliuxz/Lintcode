package S201TO400;

public class S212 {
    public int replaceBlank(char[] string, int length) {
        // write your code here
        if(string == null || string.length == 0 || length == 0)
            return 0;

        int num = 0;
        for(int i = 0; i < length; i++){
            if(string[i] == ' ')
                num++;
        }

        int newLen = length + num * 2;
        string[newLen] = 0;
        int j = 1;
        for(int i = length - 1; i >= 0; i--){
            if(string[i] != ' '){
                string[newLen - j] = string[i];
                j++;
            }
            else{
                string[newLen - j] = '0';
                j++;
                string[newLen - j] = '2';
                j++;
                string[newLen - j] = '%';
                j++;
            }
        }
        return newLen;
    }
}
