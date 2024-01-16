public class Palindrome {
    public static void main(String[] args){
        String s = "aaab";
        System.out.println(palindromeIndex(s));
        String s1 = "baa";
        System.out.println(palindromeIndex(s1));
        String s2 = "aaa";
        System.out.println(palindromeIndex(s2));
        String s3 = "quyjjdcgsvvsgcdjjyq";
        System.out.println(palindromeIndex(s3));

    }
    public static int palindromeIndex(String s) {
        // Write your code here
        int isPalindrome = -1;
        int size = s.length();
        char[] arr = s.toCharArray();
        for(int i =0 ; i < size/2; i++){
            if(arr[i] != arr[size-1-i]){

                if(i+1 < size){
                    boolean isRightSidePalindrome = isRightSidePalindrome(s.substring(i+1,size-i));
                    if(isRightSidePalindrome){
                        return i;
                    }
                    return size-1-i;

                }

            }
        }
        return isPalindrome;

    }

    public static boolean isRightSidePalindrome(String s){
        char[] arr = s.toCharArray();
        int size = s.length();
        for(int i = 0; i < size/2;i++){
            if(arr[i] != arr[size-1-i]){
                return false;
            }
        }
        return true;
    }
}
