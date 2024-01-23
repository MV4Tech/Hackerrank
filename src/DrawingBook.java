public class DrawingBook {
    public static void main(String[] args) {

        System.out.println(pageCount(37455, 29835));
        System.out.println(pageCount(73201,57075));
        System.out.println(pageCount(59867,35733));

    }

    public static int pageCount(int n, int p) {
        if (p == 1 || p == n) {
            return 0;
        }

        int fromFront = p / 2;
        int fromBack = (n / 2) - (p / 2);

        return Math.min(fromFront, fromBack);
    }

}
