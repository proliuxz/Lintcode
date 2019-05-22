package S201TO400;

class Bucket{
    private int max;
    private int min;

    public int getMax() { return max; }
    public int getMin() { return min; }
    public Bucket(int num)
    {
        max = num;
        min = num;
    }
    public void addNum(int num)
    {
        if (max < num)
            max = num;
        if (min > num)
            min = num;
    }
}

class Buckets{
    Bucket[] buckets;
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;
    int bucketSize;
    int bucketNum;
    public Buckets(int[] nums) {
        for (int num: nums
        ) {
            if (num > max)
                max = num;
            if (num < min)
                min = num;
        }
        bucketSize = Math.max(1, (max - min) / (nums.length));
        bucketNum = (max - min) / bucketSize + 1;
        buckets = new Bucket[bucketNum];
        for (int num: nums
             ) {
            AddNum(num);
        }
    }
    
    public void AddNum(int num){
        int index = (num - min) / bucketSize;
        Bucket bucket = buckets[index];
        if (bucket == null)
            buckets[index] = new Bucket(num);
        else
            bucket.addNum(num);
    }

    public int getMaxGap(){
        int prevBucketMaxVal = min;
        int result = 0;
        for (Bucket bucket: buckets
             ) {
            if (bucket == null)
                continue;
            result = Math.max(result, bucket.getMin() - prevBucketMaxVal);
            prevBucketMaxVal = bucket.getMax();
        }
        return result;
    }
}

public class S400 {

    public int maximumGap(int[] nums) {
        // write your code here
        if (nums == null || nums.length < 2)
            return 0;
        Buckets buckets = new Buckets(nums);
        return buckets.getMaxGap();
    }

    public static void main(String[] args)
    {
        S400 s = new S400();
        int[] nums = new int[]{1,9,2,5};
        System.out.println(s.maximumGap(nums));
    }
}
