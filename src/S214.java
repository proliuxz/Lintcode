public class S214 {
    public float maxOfArray(float[] A) {
        // write your code here
        float max = A[0];
        for (float f: A
             ) {
            if(f > max)
                max = f;
        }
        return max;
    }
}
