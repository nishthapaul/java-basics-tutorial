package sdp.designpatterns.filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilterFunctionality {
    static Function f;

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6};
        printArray(a);

        f = new Even();
        int[] evenArray = map(f, a);
        printArray(evenArray);

        f = new Odd();
        int[] oddArray = map(f, a);
        printArray(oddArray);

    }

    public static int[] map(Function f, int[] a) {
        List<Integer> temp = new ArrayList<>();
        for (int j : a) {
            if ( f.apply(j) )
                temp.add(j);
        }
        return convertToArray(temp);
    }

    public static int[] convertToArray(List<Integer> list) {
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }

    public static void printArray(int[] a) {
        System.out.println(Arrays.toString(a));
    }
}
