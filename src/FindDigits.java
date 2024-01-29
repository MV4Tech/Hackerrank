public class FindDigits {
    public static void main(String[] args) {

            int n = 1012;
            System.out.println(findDigits(n));
    }
    public static int findDigits(int n) {
        // Write your code here
        int temp = n;
        int result = 0;
        while(n != 0){
            int a = n%10;
            if(a == 0){
                n /= 10;
                continue;
            }
            if(temp%a == 0){
                result++;
            }
            n/=10;
        }
        return result;

    }
}
