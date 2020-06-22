package S1001TO1200;

public class S1138 {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count =0;
        for(int i: flowerbed)
            count += i;
        return (flowerbed.length / 2 + flowerbed.length % 2) >= n + count;
    }
}
