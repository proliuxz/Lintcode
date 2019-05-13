package S001TO200;

public class S128 {
    public int hashCode(char[] key, int HASH_SIZE) {
        // write your code here
        long ans = 0;
        for(int i = 0; i < key.length;i++) {
            ans = (ans * 33 + (int)(key[i])) % HASH_SIZE;
        }
        return (int)ans;
    }
}
