public class MaxDifference {
    public static void main(String[] args) {
        int[] a = new int[]{3, 4, 8, 9, 5, 4, 10, 2, 8};
        System.out.println(maxDiff(a, 0, a.length));
    }
    public static int maxDiff (int[] a, int start, int end) {
        if (end-start < 2) {
            return 0;
        }
        int middle = (int)Math.floor((end+start)/2);
        return max(new int[]{maxDiff(a, start, middle), maxDiff(a, middle, end), max(a, middle, end) - min(a, start, middle)}, 0, 3);
    }
    public static int max (int[] b, int start, int end) {
        int max = Integer.MIN_VALUE;
        for (int i = start; i < end; i++) {
            if (b[i] > max) {
                max = b[i];
            }
        }
        return max;
    }
    public static int min (int[] b, int start, int end) {
        int min = Integer.MAX_VALUE;
        for (int i = start; i < end-start; i++) {
            if (b[i] < min) {
                min = b[i];
            }
        }
        return min;
    }
}
