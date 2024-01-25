import java.util.Arrays;

public class ElectronicShop {
    public static void main(String[] args) {

        int[] keyboards = new int[]{3,1};
        int[] drives = new int[]{5,2,8};
        int b = 10;
        System.out.println(getMoneySpent(keyboards,drives,b));

    }
    static int getMoneySpent(int[] keyboards, int[] drives, int b) {

        Arrays.sort(keyboards);
        Arrays.sort(drives);
        int sum = -1;

        for(int i = keyboards.length-1; i >= 0; i--){
            for(int j = drives.length-1; j >= 0; j--){
                if(keyboards[i] + drives[j] <= b){
                    if(sum < keyboards[i] + drives[j]){
                        sum =  keyboards[i] + drives[j];
                    }
                }
            }
        }
        return sum;
    }
}
