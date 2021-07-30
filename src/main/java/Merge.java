import java.util.Arrays;

/**
 * Даны два отсортированных по возрастанию массива. Как без сортировки их объединить в третий массив?
 */

public class Merge {

    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int o = 0;

        if (left.length == 0) {
            return right;
        }

        if (right.length == 0) {
            return left;
        }

        for (int i = 0; i < left.length; i++) {
            if (0 >= rsl.length) {
                break;
            }
            for (int j = 0; j < right.length; j++) {
                if (left[i] < right[j] && left[i] != 0 && right[j] != 0) {
                    rsl[o] = left[i];
                    left[i] = 0;
                    o++;

                    if (i < left.length - 1) {
                        i++;
                    }
                    j--;
                } else {
                    rsl[o] = right[j];
                    o++;
                    if (0 >= rsl.length) {
                        break;
                    }
                }
            }

        }

        return rsl;
    }

    public static void main(String[] args) {
        int[] expect = {1, 2, 3, 4};
        System.out.println(Arrays.toString(Merge.merge(new int[] {1, 5, 6, 8, 7, 9}, new int[] {1, 2, 3, 4, 8, 9, 10})));

    }

}