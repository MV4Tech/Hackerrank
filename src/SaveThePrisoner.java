public class SaveThePrisoner {
    public static void main(String[] args) {

        int n = 6;
        int m = 10;
        int s = 5;

        System.out.println(saveThePrisoner(n, m, s));

    }

    public static int saveThePrisoner(int n, int m, int s) {
        // Write your code here
        m--;
        while (true) {
            while (!(s == n)) { // to do
                ++s;
                --m;
                if (m == 0) {
                    return s;
                }
            }
            s = 0;

        }
            /*
             or this
            m = (m - 1) % n;
            s = (s - 1 + m) % n + 1;
            return s;
                */


    }
}
