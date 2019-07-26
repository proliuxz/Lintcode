package S1001TO1200;

public class S1104 {
    public boolean judgeCircle(String moves) {
        // Write your code here
        int lr = 0;
        int ud = 0;
        for (char move: moves.toCharArray()
             ) {
            switch (move)
            {
                case 'L': lr++; break;
                case 'R': lr--; break;
                case 'U': ud++; break;
                case 'D': ud--; break;
                default: break;
            }
        }
        return lr == 0 && ud == 0;
    }
}
