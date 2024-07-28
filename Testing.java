public class Testing {
    public static void main(String[] args) {
        // Kiem thu bien
        int[][] testCases1 = {
                { 10, 10000, 20 },
                { 10, 1, -1 },
                { 10, 9999, 20 },
                { 10, 2, -1 },
                { 10, 5000, 20 },
                { 20, 5000, 20 },
                { 1, 5000, 10 },
                { 19, 5000, 20 },
                { 2, 5000, 10 }
        };
        System.out.println("Kiem thu bien:");
        for (int[] testCase : testCases1) {
            int x = testCase[0];
            int y = testCase[1];
            int expected = testCase[2];
            System.out.println("Test(" + x + ", " + y + ", " + expected + "): " + Test(x, y, expected));
        }

        // Kiem thu bang quyet dinh
        int[][] testCases2 = {
                { 0, 0, -1 },
                { 30, 4000, -1 },
                { 0, 6000, -1 },
                { 1, 0, -1 },
                { 1, 4000, 0 },
                { 1, 6000, 10 },
                { 11, 0, -1 },
                { 11, 4000, 10 },
                { 11, 6000, 20 }
        };
        System.out.println("Kiem thu bang quyet dinh:");
        for (int[] testCase : testCases2) {
            int x = testCase[0];
            int y = testCase[1];
            int expected = testCase[2];
            System.out.println("Test(" + x + ", " + y + ", " + expected + "): " + Test(x, y, expected));
        }

        // Kiem thu dong dieu khien độ đo C2
        int[][] testCases3 = {
                { 0, 0, -1 },
                { 11, 5000, 20 },
                { 10, 4000, 10 },
                { 9, 3000, 0 }
        };
        System.out.println("Kiem thu do do C2:");
        for (int[] testCase : testCases3) {
            int x = testCase[0];
            int y = testCase[1];
            int expected = testCase[2];
            System.out.println("Test(" + x + ", " + y + ", " + expected + "): " + Test(x, y, expected));
        }

        // Kiem thu dong du lieu voi do phu all-uses
        int[][] testCases4 = {
                { 0, 0, -1 },
                { 11, 5500, 20 },
                { 12, 6000, 20 },
                { 11, 4000, 10 },
                { 9, 6000, 10 },
                { 5, 1000, 0 }

        };
        System.out.println("Kiem thu dong du lieu voi do phu all-uses:");
        for (int[] testCase : testCases4) {
            int x = testCase[0];
            int y = testCase[1];
            int expected = testCase[2];
            System.out.println("Test(" + x + ", " + y + ", " + expected + "): " + Test(x, y, expected));
        }
    }

    public static int Discount(int x, int y) {
        if (x < 1 || y < 1 || x > y || x > 20 || y > 10000) {
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
