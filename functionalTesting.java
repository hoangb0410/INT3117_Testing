public class functionalTesting {
    public static void main(String[] args) {
        // System.out.println(Test(10, 10000, 20));
        // System.out.println(Test(10, 1, -1));
        // System.out.println(Test(1, 5000, 10));
        int[][] testCases = {
                { 10, 10000, 20 },
                { 10, 1, -1 },
                { 1, 5000, 10 },
                { 19, 5000, 20 },
                { 30, 4000, -1 }
        };

        for (int[] testCase : testCases) {
            int x = testCase[0];
            int y = testCase[1];
            int expected = testCase[2];
            System.out.println("Test(" + x + ", " + y + ", " + expected + "): " + Test(x, y, expected));
        }
    }

    public static int Discount(int x, int y) {
        if (x < 1 || y < 1 || x > y) {
            return -1; // -1 corresponds to invalid input
        }
        if (x >= 10 && y >= 5000) {
            return 20; // 20%
        }
        if (x >= 10 || y >= 5000) {
            return 10; // 10%
        }
        return 0; // 0%
    }

    public static String Test(int x, int y, int expect) {
        int discount = Discount(x, y);
        if (discount == expect) {
            return "PASS";
        } else
            return "FAIL";
    }
}
