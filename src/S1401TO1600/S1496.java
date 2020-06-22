package S1401TO1600;

public class S1496 {
    public int rand10() {
        int num = (rand7() - 1) * 7 + rand7();
        return (num <= 40) ? (num % 10 + 1) : rand10();
    }

    private int rand7(){
        return 0;
    }
}
