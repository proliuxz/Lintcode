public class SS1672 {
    private static int min;
    public static int getAns(int[] cards) {
        int[] newCards = new int[9];
        for (int card : cards)
            newCards[card - 1]++;
        min = newCards.length;
        dfs(newCards, 0, 5);
        return min;
    }

    private static void dfs(int[] cards, int sum, int partOfCount) {
        int start = 0, end = 0;
        for (int i = 0; i < cards.length; i++) {
            if (cards[i] == 0) {
                start = i;
                end = i;
            } else
                end = i;
            if (end - start >= partOfCount)
                break;
        }
        if (end-start < partOfCount) {
            int res = 0;
            for (int i = 0; i < cards.length; i++)
                if (cards[i] != 0)
                    res++;
            min = Math.min(min, res + sum);
            return;
        }
        A:
        for (int i = 0; i <= cards.length - partOfCount; i++) {
            int j = i, count = 0;
            for (; j < cards.length; j++) {
                if (cards[j] == 0 && j - i < partOfCount)
                    continue A;
                if (cards[j] == 0) {
                    count = j - i;
                    break;
                } else if (j == cards.length - 1)
                    count = j - i + 1;
            }
            while (count != partOfCount - 1) {
                for (int k = i; k < i + count; k++)
                    cards[k]--;
                dfs(cards, 1 + sum, partOfCount);
                for (int k = i; k < i + count; k++)
                    cards[k]++;
                count--;
            }
        }
    }

    public static void main(String[] args)
    {
        int[] cards = new int[]{2,2,2,3,4,5,7,1};
        SS1672 s = new SS1672();
        s.getAns(cards);
    }
}
