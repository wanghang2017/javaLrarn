
public class SortFunctions {

    public static void main(String[] args) {
        int[] initAry = createAry(12);
        printAry(initAry);
        // int[] ary = bubbleSort(initAry);
        // int[] ary = selectionSort(initAry);
        int[] ary = insertionSort(initAry);
        printAry(ary);
    }

    public static void printAry(int[] ary) {
        for (int num = 0; num < ary.length; num++) {
            System.out.print(ary[num] + " ");
        }
        System.out.println();
    }

    public static int[] createAry(int count) {
        int[] ary = new int[count];
        for (int i = 0; i < count; i++) {
            ary[i] = (int) (Math.random() * 100) + 1;
        }
        return ary;
    }

    public static int[] insertionSort(int[] ary) {
        for (int i = 1; i < ary.length; i++) {
            int cur = ary[i];
            int index = i - 1;
            for (; index >= 0; index--) {
                if (ary[index] > cur) {
                    ary[index + 1] = ary[index];
                } else {
                    break;
                }

            }
            ary[index + 1] = cur;
        }
        return ary;
    }

    public static int[] selectionSort(int[] ary) {
        for (int i = 0; i < ary.length; i++) {
            int minIndex = i;
            for (int y = i; y < ary.length; y++) {
                if (ary[y] < ary[minIndex]) {
                    minIndex = y;
                }
            }
            int temp = ary[minIndex];
            ary[minIndex] = ary[i];
            ary[i] = temp;
        }
        return ary;
    }

    public static int[] bubbleSort(int[] ary) {
        for (int i = 0; i < ary.length; i++) {
            boolean sorted = true;
            for (int y = 0; y < ary.length - i - 1; y++) {
                int cur = ary[y];
                int next = ary[y + 1];
                if (cur > next) {
                    int temp = cur;
                    ary[y] = next;
                    ary[y + 1] = temp;
                    sorted = false;
                }
            }
            if (sorted) {
                System.out.println("排序ok ! 共遍历了 " + (i + 1) + "次");
                break;
            }
        }
        return ary;
    }
}