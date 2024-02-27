public class JumpingOnTheClouds {
    public static void main(String[] args) {

        int[] c = {0, 0, 1, 0, 0, 1, 1, 0};
        int k = 2;
        System.out.println(jumpingOnClouds(c, k));

    }

    static int jumpingOnClouds(int[] c, int k) {

        int energy = 100;
        int n = c.length;
        for(int i = 0; i < c.length; i++){

            i = (i+k)%n;
            energy--;
            if(c[i] == 1){
                energy-=2;
            }


            if(i == 0){
                return energy;
            }
            --i;
        }

        return -1;
    }
}
