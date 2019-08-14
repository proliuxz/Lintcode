package S601TO800;

public class S658 {
    void swap (int a, int b)
    {
        a = a^b;
        b = b^a;
        a = a^b;
    }
}
