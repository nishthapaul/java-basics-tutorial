package sdp.designpatterns;

import java.util.Arrays;

public class WorkBruteForce {
    public static void main(String[] args) {
        System.out.println("SDP");
        int[] a = {1, 2, 3};
        printArray(a);

        // Create an array which is double of array a
        int[] a1 = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            a1[i] = a[i] * 2;
        }
        printArray(a1);

        // Create an array which is square of array a
        int[] a2 = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            a2[i] = a[i] * a[i];
        }
        printArray(a2);


    }

    public static void printArray(int[] a) {
        System.out.println(Arrays.toString(a));
    }
}
