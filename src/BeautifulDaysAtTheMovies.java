public class BeautifulDaysAtTheMovies {
    public static void main(String[] args) {
        int i = 20;
        int j = 23;
        int k = 6;
        System.out.println(beautifulDays(i, j, k));
    }
    public static int beautifulDays(int i, int j, int k) {
        // Write your code here
        int result = 0;
        StringBuilder str = new StringBuilder();

        for(int m = i; m <= j; m++){
            String s = str.append(m).reverse().toString();
            int n = Integer.valueOf(s);
            if(Math.abs(m-n)%k==0){
                result++;
            }
            str = new StringBuilder();
        }
        return result;
    }
}
