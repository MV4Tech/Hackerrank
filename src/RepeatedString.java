public class RepeatedString {
    public static void main(String[] args) {
        String s = "aba";
        long n = 10;
        System.out.println(repeatedString(s, n));
    }

    public static long repeatedString(String s, long n) {
        // Write your code here

        int g = 0;
        char[] word = s.toCharArray();
        String str = "";
        while(n!=0){
            str+=word[g];
            g++;
            if(g == s.length()){
                g=0;
            }
            n--;
        }
        long result = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == 'a'){
                result++;
            }
        }
        return result;

    }
}
