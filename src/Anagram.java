public class Anagram {
    public static void main(String... args){
        String s = "aaabbb";
        System.out.println(anagram(s));
        String s1 = "ab";
        System.out.println(anagram(s1));
        String s2 = "abc";
        System.out.println(anagram(s2));
        String s3 = "mnop";
        System.out.println(anagram(s3));
        String s4 = "xyyx";
        System.out.println(anagram(s4));
        String s5 = "xaxbbbxx";
        System.out.println(anagram(s5));
    }

    public static int anagram(String s) {
        // Write your code here
        if(s.length()%2!=0){
            return -1;
        }
        int length = s.length()/2;



        char[] a = s.substring(0,length).toLowerCase().toCharArray();
        char[] b = s.substring(length).toLowerCase().toCharArray();

        int[] aCount = new int[26];
        int[] bCount = new int[26];

        for(int i =0; i < a.length; i++){
            aCount[a[i]-'a']++;
        }

        for(int i =0; i < b.length; i++){
            bCount[b[i]-'a']++;
        }

        int changes = 0;
        for(int i =0; i < 26; i++){
            changes+=Math.abs(aCount[i]-bCount[i]);
        }
        return changes/2;


    }
}
