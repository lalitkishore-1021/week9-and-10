public class HeightAnalysis {

    public static int[] generateHeights(int size) {
        int[] heights = new int[size];

        for (int i = 0; i < size; i++) {
            heights[i] = (int)(Math.random() * 100 + 150);
        }
        return heights;
    }

    public static int sum(int[] arr) {
        int s = 0;
        for (int i : arr) s += i;
        return s;
    }

    public static double mean(int[] arr) {
        return (double) sum(arr) / arr.length;
    }

    public static int min(int[] arr) {
        int m = arr[0];
        for (int i : arr) if (i < m) m = i;
        return m;
    }

    public static int max(int[] arr) {
        int m = arr[0];
        for (int i : arr) if (i > m) m = i;
        return m;
    }

    public static void main(String[] args) {
        int[] heights = generateHeights(11);

        System.out.println("Mean = " + mean(heights));
        System.out.println("Shortest = " + min(heights));
        System.out.println("Tallest = " + max(heights));
    }
}