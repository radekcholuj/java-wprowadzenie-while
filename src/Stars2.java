public class Stars2 {
    public static void main(String[] args) {
        int n = 3;
        int i = n;
        int j;
        int z =0;


        while (i > 0) {
            j=i;
            z = 2 * (n - i) + 1;
            while (j > 0) {
                System.out.print(" ");
                j--;
            }
            while (z > 0) {
                System.out.print("*");
                z--;
            }

            System.out.println();
            i--;

        }


    }
}
