package S801TO1000;

public class S977 {
    public String convertToBase7(int num) {
        if (num < 0) {
            return "-" + convertToBase7(-num);
        }
        if (num < 7) {
            return num + "";
        }
        return convertToBase7(num / 7) + num % 7;
    }
}
