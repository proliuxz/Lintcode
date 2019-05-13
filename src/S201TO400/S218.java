package S201TO400;

public class S218 {
    public String name;
    public int score;
    public S218(String n)
    {
        this.name = n;
    }
    public char getLevel(){
        if (score >= 90)
            return 'A';
        else if (score >= 80)
            return 'B';
        else if (score >= 60)
            return 'C';
        else
            return 'D';
    }
}
