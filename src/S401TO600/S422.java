package S401TO600;

public class S422 {
    public int lengthOfLastWord(String s) {
        // write your code here
        String[] arr = s.split(" ");
        return arr[arr.length-1].length();
    }
}
