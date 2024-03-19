package sdp.designpatterns.map;

import java.util.Arrays;

public class MapFunctionality {
    public static void main(String[] args) {
        System.out.println("SDP");
        int[] a = {1, 2, 3};
        printArray(a);

        Function dbl = new Double();
        int[] doubledArray = map(dbl, a);
        printArray(doubledArray);

        Function sqr = new Function() {
            @Override
            public int operate(int n) {
                return n * n;
            }
        };
        int[] squaredArray = map(sqr, a);
        printArray(squaredArray);
    }

    public static int[] map (Function f, int[] a) {
        int[] result = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            result[i] = f.operate(a[i]);
        }
        return result;
    }

    public static void printArray(int[] a) {
        System.out.println(Arrays.toString(a));
    }
}
