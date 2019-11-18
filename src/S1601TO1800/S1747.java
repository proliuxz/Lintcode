package S1601TO1800;

public class S1747 {
    public boolean robotReturntoOrigin(String moves) {
        // Write your code here.
        int x = 0;
        int y = 0;
        for (char move: moves.toCharArray()
        ) {
            switch (move){
                case 'U': x++; break;
                case 'D': x--; break;
                case 'R': y++; break;
                case 'L': y--; break;
            }
        }
        return x == 0 && y == 0;
    }
}
