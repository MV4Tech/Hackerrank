public class ReverseString {
    public static void main(String[] args) {
        String s = "There once was ship that put to sea and the name of the ship was the billy o tea";
        System.out.println(reverseString(s));
    }

    private static String reverseString(String s) {
        char[] arr = s.toCharArray();
        String result=" ";
        for(int i = arr.length-1; i >= 0; i--){
            result+=arr[i];
        }
        return result;
    }


}
