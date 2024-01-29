public class UtopianTree {
    public static void main(String[] args) {

            int n = 5;
            System.out.println(utopianTree(n));

    }

    public static int utopianTree(int n) {
        // Write your code here

        if(n == 0) {
            return 1;
        }
        int height = 1;
        int counter = 1;
        System.out.println(n);
        while(counter != n){
            if(counter%2==1){
                height *=2;
            }else{
                height++;
            }

            counter++;
        }
        if(counter%2==1){
            height *=2;
        }else{
            height++;
        }
        return height;

    }

}
