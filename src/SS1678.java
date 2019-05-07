import java.util.Stack;

public class SS1678 {
    public int trainCompartmentProblem(int[] arr) {
        // Write your code here.
        if(arr.length == 0)
            return -1;
        int res = 0;
        Stack<Integer> stack = new Stack<Integer>();

        int popIndex = 0;
        for(int i = 0; i < arr.length;i++){
            stack.push(i+1);
            res = Math.max(res, stack.size());
            while(!stack.empty() &&stack.peek() == arr[popIndex]){
                stack.pop();
                popIndex++;
            }
        }

        if(stack.empty()){
            return res;
        }else {
            return -1;
        }
    }
}
