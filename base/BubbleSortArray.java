package base;
// code from https://github.com/Arhiser/java_tutorials/blob/master/src/ru/arhiser/sort/BubbleSort.java
public class BubbleSortArray {
    public static void main(String[] args) {
        int[] array = {32, 12, 43, 56, 54, 88, 76, 23, 11, 54, 98, 34, 34, 67, 86};
        System.out.println(arrayToString(array));

        boolean isSort = false;
        while (!isSort) {
            isSort = true;
            for (int i = 1; i < array.length; i++) {
                if (array[i - 1] > array[i]) {
                    int tmp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = tmp;
                    isSort = false;
                }
            }
        }
        System.out.println(arrayToString(array));
    }


    private static String arrayToString(int[] array) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < array.length; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(array[i]);
        }
        sb.append("]");
        return sb.toString();
    }
}
