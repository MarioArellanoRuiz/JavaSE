package codefights;

/**
 *
 * @author mario
 */
public class RotateImage {

    public static void main(String[] args) {

        int[][] a = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        rotateImage(a);
    }

    static int[][] rotateImage(int[][] a) {

        int b[][] = new int[a.length][a.length];

        for (int x = 0; x < a.length; x++) {
            for (int y = a.length - 1; y >= 0; y--) {
                b[x][(a.length - 1) - y] = a[y][x];
                System.out.print(a[y][x]);
            }
        }
        return b;
    }
}
