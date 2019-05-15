package S201TO400;

public class S254 {
    public int dropEggs(int n) {
        // Write your code here
        long ans = 0;
        int i = 1;
        while (ans < n)
        {
            ans += (long) i++;
        }
        return i - 1;
    }


    public static void main(String[] args)
    {
        S254 s = new S254();
        int[] eggs = new int[] {1,2,3,4,5,6,7,8,9,10};
        for (int egg: eggs
             ) {
            System.out.println(s.dropEggs(egg));
        }
    }
}
