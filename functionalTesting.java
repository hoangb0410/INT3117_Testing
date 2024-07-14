public class functionalTesting {
    public static void main(String[] args) {
        System.out.println(Discount(9, 4000));
    }

    public static int Discount(int x, int y) {
        if (x < 0 || y < 0 || x > y) {
            return -1;
        }
        if (x >= 10 && y >= 5000) {
            return 20;
        }
        if (x >= 10 || y >= 5000) {
            return 10;
        }
        return 0;
    }
}
