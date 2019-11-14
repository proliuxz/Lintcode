package S1201TO1400;

public class S1250 {
    public int thirdMax(int[] nums) {
        // Write your code here.
        long memory[] = {Long.MIN_VALUE, Long.MIN_VALUE, Long.MIN_VALUE};
        for(int i = 0; i < nums.length; ++i){
            if(nums[i] == memory[0] || nums[i] == memory[1] || nums[i] == memory[2])
                continue;
            if(nums[i] > memory[2]){
                memory[0] = memory[1];
                memory[1] = memory[2];
                memory[2] = nums[i];
            }else if(nums[i] > memory[1]){
                memory[0] = memory[1];
                memory[1] = nums[i];
            }else if(nums[i] > memory[0]){
                memory[0] = nums[i];
            }
        }
        for(int i = 0; i < memory.length; i++){
            if(memory[i] == Long.MIN_VALUE)
                return (int)memory[2];
        }
        return (int)memory[0];
    }
}
