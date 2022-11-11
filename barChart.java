public class barChart {
    public static void main(String[] args) {
        int arr[] = { 2, 3, 5, 7, 1,9};
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        for (int j = max; j >= 1; j--) {
            for (int k = 0; k < arr.length; k++) {
                if (arr[k] >= j) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
        
    }
}
