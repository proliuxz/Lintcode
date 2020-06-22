package S601TO800;

import java.util.ArrayList;
import java.util.List;

class Card {
    private int value;

    public Card(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

abstract class Actor{
    private List<Card> cards;
    protected int money;
    public Actor(int m){
        money = m;
    }
    public void assignCard(Card card) {
        cards.add(card);
    }
    public List<Integer> getPossibleValues(){
        int aCount = 0;
        int value = 0;
        List<Integer> res = new ArrayList<>();
        for (Card card: cards) {
            int v = card.getValue();
            if (v == 1) {
                value += 1;
                aCount++;
            } else if (v < 10)
                value += v;
            else
                value += 10;
        }
        for (int i = 0; i <= aCount; i++) {
            res.add(value + i * 10);
        }
        return res;
    }

    public Integer getBestValue() {
        List<Integer> values = getPossibleValues();
        int res = 0;
        for (int val: values) {
            if (val <= 21 && val > res)
                res = val;
        }
        return res;
    }

    public int compareTo(Actor t2)
    {
        int b1 = getBestValue();
        int b2 = t2.getBestValue();
        return b1 - b2;
    }

    public String printCards() {
        String res = "Cards: ";
        for (int i = 0; i < cards.size(); i++){
            res += (cards.get(i).getValue());
            if(i != cards.size() - 1){
                res+=" , ";
            }
            else
                res+=';';
        }

        res += " Current best value is: " + getBestValue();
        return res;
    }
    public void print() {}
    public void win(int m) {
        money += m;
    }
    public void lose(int m) {
        money -= m;
    }
}

class NormalPlayer extends Actor{
    private int id;
    private int bet;

    public int getBet() {
        return bet;
    }

    public NormalPlayer(int id, int bet) {
        super(1000);
        money -= bet;
        this.bet = bet;
    }

    @Override
    public void win(int m) {
        super.win(m * 2);
    }

    @Override
    public void lose(int m) {
        super.lose(0);
    }

    //playerid: 1 ;Cards: 1 , 1; Current best value is: 12, current bets: 10, total bets: 990
    @Override
    public void print() {
        StringBuilder sb = new StringBuilder();
        sb.append("playerid: ");
        sb.append(id);
        sb.append(";");
        sb.append(super.printCards());
        sb.append(", current bets: ");
        sb.append(bet);
        sb.append(", total bets: ");
        sb.append(money);
        System.out.println(sb.toString());
    }
}

class Dealer extends Actor{

    public Dealer() {
        super(10000);
    }

    @Override
    public void print() {
        StringBuilder sb = new StringBuilder();
        sb.append("Dealer ");
        sb.append(super.printCards());
        sb.append(", total bets: ");
        sb.append(money);
        System.out.println(sb.toString());
    }
}

public class S714 {
    private List<Card> cards;
    private List<NormalPlayer> players = new ArrayList<>();
    private Dealer dealer = new Dealer();
    public void initCards(List<Card> cards) {
        this.cards = cards;
    }

    public void addPlayer(NormalPlayer p) {
        this.players.add(p);
    }


    public void dealInitialCards() {
        for (NormalPlayer player : players) {
            player.assignCard(dealNextCard());
        }
        dealer.assignCard(dealNextCard());
        for (NormalPlayer player : players) {
            player.assignCard(dealNextCard());
        }
        dealer.assignCard(dealNextCard());
    }

    public Card dealNextCard() {
        Card card = cards.remove(0);
        return card;
    }

    public Dealer getDealer() {
        return dealer;
    }

    public void compareResult() {
        print();
        for (NormalPlayer p : players)
        {
            if (dealer.compareTo(p) > 0)
            {
                dealer.win(p.getBet());
                p.lose(p.getBet());
            }

            else if (dealer.compareTo(p) < 0)
            {
                dealer.lose(p.getBet());
                p.win(p.getBet());
            }
        }
        print();
    }

    public void print() {
        for (NormalPlayer p: players
             ) {
            p.print();
        }
        dealer.print();
    }
}
