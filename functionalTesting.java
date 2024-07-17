public class functionalTesting {
    public static void main(String[] args) {
        // test case 1:
        System.out.println(Discount(9, 4000));
    }

    public static int Discount(int x, int y) {
        if (x < 1 || y < 1 || x > y) {
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
